from unittest.mock import MagicMock

import pytest

from src.hr.ServiceImplHR import ServiceImplHR


def test_service_impl_hr_compute():
    """compute() method should compute data from DAO."""
    # Create a DAO mock to provide controlled data
    mock_dao = MagicMock()
    mock_dao.get_data.return_value = 185  # Simulate a data value

    # Create a ServiceImplHR instance with the DAO mock
    service_impl_hr = ServiceImplHR(mock_dao)

    # Call the compute method
    result = service_impl_hr.compute()

    # Verify that the result is correct (75% of the simulated data value)
    assert result == 185 * 0.75


if __name__ == '__main__':
    pytest.main([__file__])
