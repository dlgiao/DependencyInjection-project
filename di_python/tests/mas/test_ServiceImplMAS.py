from unittest.mock import MagicMock

import pytest

from src.mas.ServiceImplMAS import ServiceImplMAS


def test_service_impl_mas_compute():
    """compute() method should compute data from DAO."""
    # Create a DAO mock to provide controlled data
    mock_dao = MagicMock()
    mock_dao.get_data.return_value = 17.5  # Simulate a data value

    # Create a ServiceImplMAS instance with the DAO mock
    service_impl_mas = ServiceImplMAS(mock_dao)

    # Call the compute method
    result = service_impl_mas.compute()

    # Verify that the result is correct (70% of the simulated data value)
    assert result == 17.5 * 0.70


if __name__ == "__main__":
    pytest.main([__file__])
