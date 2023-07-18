FROM openjdk:11-jdk
WORKDIR /usr/app
COPY /target/common-0.0.1-SNAPSHOT.jar ./common.jar
COPY . .
ENTRYPOINT ["java","-jar","common.jar"]
EXPOSE 8085
