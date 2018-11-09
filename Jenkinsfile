pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
     parallel(
       install: {
                    sh "echo 'instaling' "
                }, sonar: {
                    sh "echo 'sonaring' "
                })      }
    }
  }
}