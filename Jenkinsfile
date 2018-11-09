pipeline {
  agent any
  stages {
    stage('Test') {
       parallel(
       install: {
                    sh "echo 'instaling' "
                }, sonar: {
                    sh "echo 'sonaring' "
                })
    }
  }
}