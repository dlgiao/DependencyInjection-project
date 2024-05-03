"""
Dependency Injection project in Python

This Python project demonstrates dependency injection using constructor injection.
It includes an API with two interface classes: DAO and Service.
The DAO interface simulates data access, while the Service interface simulates data computation.
Two versions (mas and hr) implement constructor injection from DAO into Service layer.

DAO Interface Documentation

This Python interface defines the structure for a Data Access Object (DAO) responsible for data
retrieval operations.

Usage:
    - Implement a concrete class that inherits from this interface.
    - Override the get_data method to define data retrieval logic.

Author: Dac Linh Giao NGUYEN
Date: 2024

"""

from abc import ABC, abstractmethod


class DAO(ABC):
    """Abstract base class for data access operations."""

    @abstractmethod
    def get_data(self):
        """Abstract method to retrieve data."""
        pass
