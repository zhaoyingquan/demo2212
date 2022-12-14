FROM openjdk:11
EXPOSE 8765
COPY demo2212.jar /demo2212.jar
ENTRYPOINT ["java","-jar","/demo2212.jar"]