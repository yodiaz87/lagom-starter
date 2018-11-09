pipeline {
  docker { image 'node:7-alpine' }
  stages {
    stage('build') {
      steps {
        sh 'sbt compile'
      }
    }
  }
}