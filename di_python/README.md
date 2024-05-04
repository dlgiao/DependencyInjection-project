# Dependency Injection Project

This project demonstrates the concept of Dependency Injection (DI) in Python using pip.

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
- `main`: Contains the `main` method to demonstrate the usage of different use cases.

## Usage

To run the project, follow these steps:

1. Clone this repository.
2. Navigate to the root directory of the project.
3. Run the following command:

```bash
pip install -r requirements.txt
```

```bash
python main.py
```
This will execute the main function in the main.py file, demonstrating the usage of different versions (MAS and HR) of DAO and Service implementations.

## Dependencies

This project requires:

- Python 3
- pip

## Contributions

Contributions to enhance and expand this project are welcome. Feel free to fork the repository, make your changes, and submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.