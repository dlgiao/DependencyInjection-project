FROM openjdk:21-oracle
LABEL authors="daclinhgiaonguyen"

# Set the working directory in the container
WORKDIR /app

# Copy the Gradle wrapper and build files
COPY gradlew .
COPY gradle ./gradle
COPY build.gradle.kts .
COPY settings.gradle.kts .
COPY src ./src

# Build the project
RUN ./gradlew build --no-daemon

# Specify the command to run your application
CMD ["java", "-jar", "build/libs/di_kotlin-1.0-SNAPSHOT-all.jar"]