pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "loan-eligibility:latest"
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/Tharun-coder-hash/maven_app.git'
            }
        }

        stage('Build') {
            steps {
                dir('maven_app') {
                    bat 'mvn clean compile'
                }
            }
        }

        stage('Test') {
            steps {
                dir('maven_app') {
                    bat 'mvn test'
                }
            }
        }

        stage('Package') {
            steps {
                dir('maven_app') {
                    bat 'mvn package'
                }
            }
        }

        stage('Docker Build') {
            steps {
                dir('maven_app') {
                    bat "docker build -t %DOCKER_IMAGE% ."
                }
            }
        }

        stage('Kubernetes Deploy') {
            steps {
                dir('maven_app') {
                    bat "kubectl apply -f k8s/deployment.yaml"
                }
            }
        }
    }
}
