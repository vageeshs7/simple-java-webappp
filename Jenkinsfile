pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
		stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
		stage('Publish') {
            steps {
                sh 'mvn install:install-file -Dfile=target/simple-java-webappp.war -DpomFile=pom.xml'
            }
        }
    }
}