FROM openjdk:16-jdk-alpine
COPY ./build/libs/transactional-outbox-consumer-demo-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]