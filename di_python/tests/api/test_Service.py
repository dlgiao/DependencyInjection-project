from unittest.mock import MagicMock, patch

import pytest

from src.api.Service import Service


@pytest.fixture
def service():
    """Fixture to provide a Service instance."""
    # Use MagicMock to create a Service mock
    return MagicMock(spec=Service)


def test_service_compute(service):
    """Test the compute method of Service."""
    # Create a mock of compute() method
    with patch.object(service, "compute") as mock_compute:
        # Configure the mock behavior
        mock_compute.return_value = 10.0

        # Call the method under test
        result = service.compute()

        # Verify the expected behavior
        assert result == 10.0
        mock_compute.assert_called_once()


def test_service_compute_raise_type_error():
    """Test that calling compute method of Service raises a TypeError."""
    with pytest.raises(TypeError, match="Can't instantiate abstract class"):
        Service().compute()


if __name__ == "__main__":
    pytest.main([__file__])
