# Dependency Injection Example

This Python project demonstrates dependency injection using constructor injection. It includes an API with two interface classes: DAO and Service. The DAO interface simulates data access, while the Service interface simulates data computation. Two versions (V1 and V2) implement constructor injection from DAO into Service layer.

## Project Structure

The project is structured as follows:

- `V1/`: Contains version 1 implementations.
  - `dao/`: Contains DAO implementation for version 1.
  - `service/`: Contains Service implementation for version 1.
- `V2/`: Contains version 2 implementations.
  - `dao/`: Contains DAO implementation for version 2.
  - `service/`: Contains Service implementation for version 2.
- `api/`: Contains the interface classes.
  - `DAO.py`: Defines the DAO interface.
  - `Service.py`: Defines the Service interface.
- `main.py`: Script demonstrating the usage of different versions.

## Usage

To run the script and see the computation results for both versions (V1 and V2) of the project, execute:

```bash
python main.py
```
## Versions

### Version 1 (V1):
- **DAO implementation** (DAOImplV1) retrieves data from data source 1.
- **Service implementation** (ServiceImplV1) computes data based on data retrieved from DAOImplV1.

### Version 2 (V2):
- **DAO implementation** (DAOImplV2) retrieves data from data source 2.
- **Service implementation** (ServiceImplV2) computes data based on data retrieved from DAOImplV2.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.