pipeline {
    agent any

    tools {
        ant 'antInstaller'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'ant -buildfile build.xml'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                // Testing steps would go here
            }
        }
    }
}