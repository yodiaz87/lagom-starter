package com.inviqa.hellostream.impl

import com.lightbend.lagom.scaladsl.api.ServiceCall
import com.inviqa.hellostream.api.HelloStreamService
import com.inviqa.hello.api.HelloService

import scala.concurrent.Future

/**
  * Implementation of the HelloStreamService.
  */
class HelloStreamServiceImpl(helloService: HelloService) extends HelloStreamService {
  def stream = ServiceCall { hellos =>
    Future.successful(hellos.mapAsync(8)(helloService.hello(_).invoke()))
  }
}
