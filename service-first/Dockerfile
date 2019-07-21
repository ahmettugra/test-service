FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/service-first-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} service-first-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/service-first-0.0.1-SNAPSHOT.jar"]