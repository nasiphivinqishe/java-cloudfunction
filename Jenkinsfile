pipeline {
    agent any

    environment {
        GITHUB_CREDENTIALS = credentials('github-pat')
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', credentialsId: 'github-pat', url: 'https://github.com/nasiphivinqishe/java-cloudfunction.git'
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
                    sh 'sam deploy --template-file dev-template.yaml --stack-name MyTransit5 --capabilities CAPABILITY_IAM --s3-bucket my-transit-dev-bucket'
                }
            }
        }
    }
}
