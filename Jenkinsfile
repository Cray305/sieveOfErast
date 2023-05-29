pipeline {
    agent any

    tools {
        ant 'antInstaller'
        jdk 'jdk18'
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
                echo 'Running Application'
                sh 'java -classpath bin sieveOfErast.sieveApp 10'
            }
        }
    }
}
