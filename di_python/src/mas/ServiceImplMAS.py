"""
Dependency Injection project in Python

This Python project demonstrates dependency injection using constructor injection.
It includes an API with two interface classes: DAO and Service.
The DAO interface simulates data access, while the Service interface simulates data computation.
Two versions (mas and hr) implement constructor injection from DAO into Service layer.

ServiceImplMAS Class Documentation

This Python class implements the Service interface to provide computation functionality for version MAS
of the project.

Author: Dac Linh Giao NGUYEN
Date: 2024

Usage:
    - Instantiate ServiceImplMAS with a DAO instance to perform computations using data from the MAS data source.
    - Call the compute method to perform computation.
"""

from src.api.Service import Service


class ServiceImplMAS(Service):
    """
    Concrete implementation of the Service interface for version 1 of the project.
    This implementation performs computation based on data retrieved from a DAO instance.
    """

    def __init__(self, dao):
        """
        Constructor for ServiceImplMAS.
        Inject the specified DAO in ServiceImplMAS.

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
        print("Service computes 70% of MAS")
        data = self.dao.get_data()
        return data * 0.70
