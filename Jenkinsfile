pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh 'pwd'
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
        stage('Deploy') {
             steps {
                 sh 'curl -u both:tomcat http://localhost:8080/manager/text/list'
                 sh 'curl -u both:tomcat http://localhost:8080/manager/text/undeploy?path=/simple-java-webappp&tag=simple-java-webappp'
                 sh 'curl -u both:tomcat http://localhost:8080/manager/text/list'
                 sh 'curl -T ./target/simple-java-webappp.war -u both:tomcat http://localhost:8080/manager/text/deploy?path=/simple-java-webappp&tag=simple-java-webappp'
                 sh 'curl -u both:tomcat http://localhost:8080/manager/text/list'
             }
         }
    }
}