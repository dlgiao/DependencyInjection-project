# Dependency Injection Example Project

This project demonstrates the concept of Dependency Injection (DI) in Java using Maven.

## Overview

The project consists of two versions (MAS and HR) of DAO (Data Access Object) and Service implementations.

- **DAO (Data Access Object)**: Interface representing data access.
- **Service**: Interface representing a service performing calculations based on data provided by a DAO.

Each version of the DAO and Service is implemented separately to showcase the flexibility and ease of swapping dependencies using DI.

## Project Structure

The project is structured as follows:

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

## Dependencies

This project requires:

- Java 8 or higher
- Apache Maven

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
