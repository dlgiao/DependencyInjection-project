"""
Dependency Injection project in Python

This Python project demonstrates dependency injection using constructor injection.
It includes an API with two interface classes: DAO and Service.
The DAO interface simulates data access, while the Service interface simulates data computation.
Two versions (mas and hr) implement constructor injection from DAO into Service layer.

DAOImplHR Class Documentation

This Python class implements the DAO interface to provide data retrieval functionality for version
hr of the project.

Author: Dac Linh Giao NGUYEN
Date: 2024

Usage:
    - Instantiate DAOImplHR to access data from the HR data source.
    - Call the get_data method to retrieve data.
"""

from src.api.DAO import DAO


class DAOImplHR(DAO):
    """
    Concrete implementation of the DAO interface for version hr of the project.
    This implementation retrieves data from the second data source.
    """

    def get_data(self):
        """Retrieve data from the second data source."""
        print("Data source provides a max heart rate 185bpm")
        return 185
