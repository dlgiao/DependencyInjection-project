# Dependency Injection Example Project

This project demonstrates the concept of Dependency Injection (DI) in Go.

## Overview

The project consists of implementations for two data sources: MAS (Message Authentication Service) and HR (Heart Rate). Each data source has its own DAO (Data Access Object) and Service implementations.

- **DAO (Data Access Object)**: Interface representing data access.
- **Service**: Interface representing a service performing calculations based on data provided by a DAO.

Each data source is implemented separately to showcase the flexibility of dependency injection in Go.

## Project Structure

The project is structured as follows:

di_go/
├── hr/
│ ├── dao_impl_hr.go
│ └── service_impl_hr.go
├── mas/
│ ├── dao_impl_mas.go
│ └── service_impl_mas.go
├── api/
│ ├── dao.go
│ └── service.go
└── main.go


## Usage

To run the project, follow these steps:

1. Clone this repository.
2. Navigate to the root directory of the project.
3. Run the following command:

```bash
go run main.go
```

This will execute the main function in main.go, demonstrating the usage of different data sources (MAS and HR) and their respective DAO and Service implementations.

## Dependencies

This project has no external dependencies beyond Go itself.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.