"""
Dependency Injection project in Python

This Python project demonstrates dependency injection using constructor injection.
It includes an API with two interface classes: DAO and Service.
The DAO interface simulates data access, while the Service interface simulates data computation.
Two versions (mas and hr) implement constructor injection from DAO into Service layer.

Service Interface Documentation

This Python interface defines the structure for a service responsible for data computation.

Usage:
    - Implement a concrete class that inherits from this interface.
    - Override the compute method to define computation logic.

Author: Dac Linh Giao NGUYEN
Date: 2024

"""

from abc import ABC, abstractmethod


class Service(ABC):
    """Abstract base class for data computation operations."""

    @abstractmethod
    def compute(self):
        """Abstract method to perform data computation."""
        pass
