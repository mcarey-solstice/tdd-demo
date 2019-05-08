/**
 * Configures Jenkins
 */

pipeline {
    agent any

    stages {
        stage('Clone repo') {
            steps {
                git url: 'https://github.com/mcarey-solstice/tdd-demo', branch: 'demo'
            }
        }
        stage('Build and test') {
            steps {
                gradle 'test'
            }
        }
    }
}