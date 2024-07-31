pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/nasiphivinqishe/java-cloudfunction.git'
            }
        }
        stage('Build') {
            steps {
                script {
                    // Build steps
                    sh 'mvn clean install'
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    // Deploy steps
                    sh 'sam deploy --template-file dev-template.yaml --stack-name MyTransit5 --capabilities CAPABILITY_IAM --s3-bucket my-transit-dev-bucket'
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
