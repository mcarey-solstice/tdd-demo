/**
 * Configures Jenkins
 */

node {

    stage('Clone repo') {
        git url: 'https://github.com/mcarey-solstice/tdd-demo', branch: 'demo'
    }

    stage('Build and test') {
        echo 'Running gradle test'
        gradle('test')
    }

}