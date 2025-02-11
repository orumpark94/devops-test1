pipeline {
    agent any

    environment {
        DEPLOY_PATH = "/var/www/html"  // 배포할 서버의 경로
        SERVER_IP = "192.168.1.178"   // 실제 배포할 서버의 IP
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out code...'
                git branch: 'main', url: 'https://github.com/orumpark94/devops-test1.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building application...'
                sh 'echo "Build step: No build needed for Nginx static files"'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                sh '''
                    scp -r * jenkins@${SERVER_IP}:${DEPLOY_PATH}
                    ssh jenkins@${SERVER_IP} "sudo systemctl restart nginx"
                '''
            }
        }
    }

    post {
        success {
            echo 'Deployment successful!'
        }
        failure {
            echo 'Deployment failed!'
        }
    }
}
