pipeline {
  agent {
    docker {
      image 'hseeberger/scala-sbt'
      label 'docker'
    }

  }
  stages {
    stage('Test') {
      steps {
        sh 'ls -la'
      }
    }
  }
}