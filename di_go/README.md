# Dependency Injection Example Project

This project demonstrates the concept of Dependency Injection (DI) in Go.

## Overview

The project consists of implementations for two data sources: MAS (Message Authentication Service) and HR (Heart Rate). Each data source has its own DAO (Data Access Object) and Service implementations.

- **DAO (Data Access Object)**: Interface representing data access.
- **Service**: Interface representing a service performing calculations based on data provided by a DAO.

Each data source is implemented separately to showcase the flexibility of dependency injection in Go.

## Project Structure

The project is structured as follows:

- `dao`: Defines a Data Access Object interface .
- `service`: Defines a service that performs computation based on data provided by a DAO (Data Access Object).
- `dao_impl_mas`: Retrieves a MAS (Maximal Aerobic Speed) data from a DAO.
- `service_impl_mas`: Defines the service computes a percentage of the Maximal Aerobic Speed.
- `dao_impl_hr`: Retrieves a HR max (heart rate) data from a DAO.
- `service_impl_hr`: Defines the service computes a percentage of the HR max.
- `main`: Contains the `main` method to demonstrate the usage of different use cases.

## Usage

To run the project, follow these steps:

1. Clone this repository.
2. Navigate to the root directory of the project.
3. Run the following command:

```bash
go run main.go
```

This will execute the main function in main.go, demonstrating the usage of different data sources (MAS and HR) and their respective DAO and Service implementations.

### Running Unit Tests

Explore the comprehensive unit tests included in the project to ensure reliability and robustness. To execute them, simply run:

```bash
go test ./...
```

## Building and Running with Docker

The project includes a Dockerfile for containerization. To build an image and run the project within a container, execute the following commands:

```bash
docker build -t di_go .
docker run -it --rm di_go
```

## Dependencies

This project has no external dependencies beyond Go itself.

## Contributions

Contributions to enhance and expand this project are welcome. Feel free to fork the repository, make your changes, and submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.