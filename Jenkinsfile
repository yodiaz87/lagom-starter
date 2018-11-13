pipeline {
    agent {label "sbtserver" }
    stages {
        stage('build') {
            steps {
                sh 'sbt compile'
            }
        }
    }
}
