# Dependency Injection Project

This project demonstrates the concept of Dependency Injection (DI) in Java using Maven.

## Overview

The project consists of two versions (MAS and HR) of DAO (Data Access Object) and Service implementations.

- **DAO (Data Access Object)**: Interface representing data access.
- **Service**: Interface representing a service performing calculations based on data provided by a DAO.

Each version of the DAO and Service is implemented separately to showcase the flexibility and ease of swapping dependencies using DI.

## Project Structure

The project is structured as follows:

- `DAO`: Defines a Data Access Object interface .
- `Service`: Defines a service that performs computation based on data provided by a DAO (Data Access Object).
- `DAOImplMAS`: Retrieves a MAS (Maximal Aerobic Speed) data from a DAO.
- `ServiceImplMAS`: Defines the service computes a percentage of the Maximal Aerobic Speed.
- `DAOImplHR`: Retrieves a HR max (heart rate) data from a DAO.
- `ServiceImplHR`: Defines the service computes a percentage of the HR max.
- `Main`: Contains the `main` method to demonstrate the usage of different use cases.

## Usage

To run the project, follow these steps:

1. Clone this repository.
2. Navigate to the root directory of the project.
3. Run the following command:

```bash
mvn clean install
```

After successful build, run the Main class:

```bash
java -jar target/di_java-1.0-SNAPSHOT.jar
```

This will execute the main method in the Main class, demonstrating the usage of different versions (MAS and HR) of DAO and Service implementations.

### Running Unit Tests

Explore the comprehensive unit tests included in the project to ensure reliability and robustness. To execute them using Maven, simply run:

```bash
mvn test
```

## Building and Running with Docker

The project includes a Dockerfile for containerization. To build an image and run the project within a container, execute the following commands:

```bash
docker build -t di_java .
docker run -it --rm di_java
```

## Dependencies

Ensure the following dependencies are available:

- Java 8 or higher
- Apache Maven

## Contributions

Contributions to enhance and expand this project are welcome. Feel free to fork the repository, make your changes, and submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
