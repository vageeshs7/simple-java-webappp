FROM tomcat:latest
COPY ci/tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml
COPY /target/simple-java-webappp.war /usr/local/tomcat/webapps/simple-java-webappp.war
CMD ["catalina.sh", "run"]
