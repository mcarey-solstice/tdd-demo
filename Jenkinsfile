/**
 * Configures Jenkins
 */

pipeline {
    agent any

    stages {
        stage('See what is there') {
            steps {
                sh 'ls'
            }
        }
        stage('Build and test') {
            steps {
                gradle tasks: 'test'
            }
        }
    }
}