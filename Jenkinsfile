pipeline {
    agent any

    environment {
        GITHUB_CREDENTIALS = credentials('github-token')
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', credentialsId: 'github-token', url: 'https://github.com/nasiphivinqishe/java-cloudfunction.git'
            }
        }
        stage('Build') {
            steps {
                script {
                    // Add your build steps here
                    sh 'mvn clean install'
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    // Add your deploy steps here
                    // Example: scp or rsync to a remote server
                    sh 'scp target/myTransitApp.jar user@server:/path/to/deploy'
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
