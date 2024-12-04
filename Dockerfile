
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/feedback-0.0.1-SNAPSHOT.jar feedback-service.jar

EXPOSE 9100

ENTRYPOINT ["java", "-jar", "feedback-service.jar"]

ENV TZ=Asia/Seoul