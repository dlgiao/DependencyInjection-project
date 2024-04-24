"""
Dependency Injection project in Python

This Python script demonstrates the usage of DAO and Service implementations for two versions (MAS and HR)
of a project.
It showcases how dependency injection allows for swapping implementations seamlessly.

Author: Dac Linh Giao NGUYEN
Date: 2024

Usage:
    - Run the script to see the computation results for both versions (MAS and HR) of the project.

Example:
    python main.py

"""

from src.hr.DAOImplHR import DAOImplHR
from src.hr.ServiceImplHR import ServiceImplHR
from src.mas.DAOImplMAS import DAOImplMAS
from src.mas.ServiceImplMAS import ServiceImplMAS


def create_mas_service():
    """
    Run the computation for MAS version of the project.
    """
    print("*** Easy jog speed by MAS ***")
    dao = DAOImplMAS()
    service = ServiceImplMAS(dao)
    result = service.compute()
    print(f"Compute easy jog by MAS: {result} km/h")
    print("*** End ***")


def create_hr_service():
    """
    Run the computation for HR version of the project.
    """
    print("*** Easy jog by HR ***")
    dao = DAOImplHR()
    service = ServiceImplHR(dao)
    result = service.compute()
    print(f"Compute easy jog by HR: {result} bpm")
    print("*** End ***")


if __name__ == '__main__':
    """
    Main entry point of the script.
    """
    create_mas_service()
    create_hr_service()
