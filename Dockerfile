FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/springboot-cicd-demo-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080
CMD ["java", "-jar", "demo.jar"]