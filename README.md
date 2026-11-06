# Even-Odd Maven Project

A simple Java application tested with JUnit 5, built with Maven, and published as a Docker image through GitHub Actions.

## Project structure

```text
even-odd-maven-project/
├── pom.xml
├── Dockerfile
├── .dockerignore
├── .gitignore
├── .github/
│   └── workflows/
│       └── ci-docker.yml
└── src/
    ├── main/java/com/example/even_odd.java
    └── test/java/com/example/even_oddTest.java
```

## Run locally

Requires JDK 17 or later and Maven.

```bash
mvn clean test
mvn clean package
java -jar target/even-odd-1.0-SNAPSHOT.jar
java -jar target/even-odd-1.0-SNAPSHOT.jar 12
```

The default input is `7`. You can pass another integer as a command-line argument.

## GitHub Actions and Docker Hub

1. Create a GitHub repository, for example `even-odd-project`.
2. Push all project files to the `main` branch.
3. In GitHub, open **Settings → Secrets and variables → Actions** and add:
   - `DOCKERHUB_USERNAME`: your Docker Hub username
   - `DOCKERHUB_TOKEN`: a Docker Hub access token (not your account password)
4. Create the Docker Hub repository named `even-odd-app` under the same username.
5. Push to `main`. GitHub Actions runs JUnit tests and packages the JAR first. The Docker publish job runs only after the test/build job succeeds, and only for a push to `main`.

The published image tags are `latest` and the Git commit SHA.

## Run the published container

```bash
docker pull YOUR_DOCKERHUB_USERNAME/even-odd-app:latest
docker run --rm YOUR_DOCKERHUB_USERNAME/even-odd-app:latest
docker run --rm YOUR_DOCKERHUB_USERNAME/even-odd-app:latest 12
```
