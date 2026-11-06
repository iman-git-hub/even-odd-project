# Stage 1: Build and test the Java application with Maven
FROM maven:3.9.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package

# Stage 2: Run the executable JAR using a smaller Java runtime image
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/even-odd-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
