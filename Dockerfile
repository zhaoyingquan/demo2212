FROM openjdk:11
EXPOSE 8080
COPY ./target/demo-0.0.1-SNAPSHOT.jar /demo2212.jar
ENTRYPOINT ["java","-jar","/demo2212.jar"]
