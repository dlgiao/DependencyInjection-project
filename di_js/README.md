# Dependency Injection Example Project

This project demonstrates the concept of Dependency Injection (DI) in JavaScript/Node.js.

## Overview

The project consists of two versions (V1 and V2) of DAO (Data Access Object) and Service implementations.

- **DAO (Data Access Object)**: Interface representing data access.
- **Service**: Interface representing a service performing calculations based on data provided by a DAO.

Each version of the DAO and Service is implemented separately to showcase the flexibility and ease of swapping dependencies using DI.

## Project Structure

This structure outlines the layout of the project:

- **V1**: Contains version 1 implementations of DAO and Service.
    - **dao**: Directory for DAO implementation files.
        - `DAOImplV1.js`: Implementation of DAO interface for version 1.
    - **service**: Directory for Service implementation files.
        - `ServiceImplV1.js`: Implementation of Service interface for version 1.
- **V2**: Contains version 2 implementations of DAO and Service.
    - **dao**: Directory for DAO implementation files.
        - `DAOImplV2.js`: Implementation of DAO interface for version 2.
    - **service**: Directory for Service implementation files.
        - `ServiceImplV2.js`: Implementation of Service interface for version 2.
- **api**: Contains interface definitions for DAO and Service.
    - `DAO.js`: Interface definition for DAO.
    - `Service.js`: Interface definition for Service.
- **main.js**: Main script file to demonstrate the usage of different implementations.

This structure allows for easy navigation and organization of the project's components.


## Usage

To run the project, follow these steps:

1. Clone this repository.
2. Navigate to the root directory of the project.
3. Run the following commands:

```bash
npm install
````

```bash
npm run start
````

This will execute the main script, demonstrating the usage of different versions (V1 and V2) of DAO and Service implementations.

## Dependencies

This project requires:

- Node.js

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.