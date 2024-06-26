"""
Dependency Injection project in Python

This Python project demonstrates dependency injection using constructor injection.
It includes an API with two interface classes: DAO and Service.
The DAO interface simulates data access, while the Service interface simulates data computation.
Two versions (mas and hr) implement constructor injection from DAO into Service layer.

DAOImplMAS Class Documentation

This Python class implements the DAO interface to provide data retrieval functionality for version MAS
of the project.

Usage:
    - Instantiate DAOImplMAS to access data from the MAS data source.
    - Call the get_data method to retrieve data.

Author: Dac Linh Giao NGUYEN
Date: 2024

"""

from src.api.DAO import DAO


class DAOImplMAS(DAO):
    """
    Concrete implementation of the DAO interface for version MAS of the project.
    This implementation retrieves MAS data from the data source.
    """

    def get_data(self):
        """Retrieve data from the MAS data source."""
        print("Data source provides a MAS 17.5km/h")
        return 17.5
