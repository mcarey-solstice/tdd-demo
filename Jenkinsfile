/**
 * Configures Jenkins
 */

pipeline {
    agent any

    stages {
        stage('Build and test') {
            steps {
                gradle tasks: 'test'
            }
        }
    }
}