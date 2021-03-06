#!/usr/bin/env bash
pwd
echo 'List Existing Applications'
curl -u both:tomcat http://localhost:8080/manager/text/list

echo 'UnDeploy Applications'
curl -u both:tomcat http://localhost:8080/manager/text/undeploy?path=/simple-java-webappp&tag=simple-java-webappp

echo 'Deploy Applications'
curl -T ./target/simple-java-webappp.war -u both:tomcat http://localhost:8080/manager/text/deploy?path=/simple-java-webappp&tag=simple-java-webappp
