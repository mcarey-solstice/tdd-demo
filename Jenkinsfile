/**
 * Configures Jenkins
 */

pipeline {
    agent any

    stages {
        stage('Build and test') {
            steps {
                sh './gradlew test'
            }
        }
    }
}