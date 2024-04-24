"""
Dependency Injection project in Python

This Python project demonstrates dependency injection using constructor injection.
It includes an API with two interface classes: DAO and Service.
The DAO interface simulates data access, while the Service interface simulates data computation.
Two versions (mas and hr) implement constructor injection from DAO into Service layer.

ServiceImplHR Class Documentation

This Python class implements the Service interface to provide computation functionality for version
hr of the project.

Author: Dac Linh Giao NGUYEN
Date: 2024

Usage:
    - Instantiate ServiceImplHR with a DAO instance to perform computations using data from the HR data source.
    - Call the compute method to perform computation.
"""

from src.api.Service import Service


class ServiceImplHR(Service):
    """
    Concrete implementation of the Service interface for version hr of the project.
    This implementation performs computation based on data retrieved from a DAO instance.
    """

    def __init__(self, dao):
        """
        Constructor for ServiceImplHR.
        Inject the specified DAO in ServiceImplHR.

        Parameters:
            dao (DAO): An instance of a data access object.
        """
        self.dao = dao

    def compute(self):
        """
        Perform computation based on data retrieved from the DAO instance.

        Returns:
            float: The result of the computation.
        """
        print("Service computes 75% of max heart rate")
        data = self.dao.get_data()
        return data * 0.75
