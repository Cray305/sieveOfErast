pipeline {
    agent any
    tools {
        jdk 'Java 18'
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'ant -buildfile build.xml'
            }
        }
        stage('Check Java Version') {
            steps {
                echo 'Checking Java version..'
                sh 'java -version'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'java -classpath bin sieveOfErast.sieveApp 10'
            }
        }
    }
}
