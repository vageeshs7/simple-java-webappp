# simple-java-webapp

This repository is for the
[Build a Java webapp app with Maven](https://jenkins.io/doc/tutorials/build-a-java-app-with-maven/)
tutorial in the [Jenkins User Documentation](https://jenkins.io/doc/).

The repository contains a simple Java webapp application which outputs the string
"Hello world!" and is accompanied by a couple of unit tests to check that the
main application works as expected. The results of these tests are saved to a
JUnit XML report. Jacoco is used for code coverage report.

Jenkinsfile creates a jenkins pipeline.