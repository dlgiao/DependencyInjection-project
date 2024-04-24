from unittest.mock import MagicMock, patch

import pytest

from src.api.DAO import DAO


@pytest.fixture
def dao():
    """Fixture to provide a DAO instance."""
    # Use MagicMock to create a DAO mock
    return MagicMock(spec=DAO)


def test_dao_get_data(dao):
    """Test the get_data method of DAO."""
    # Create a mock of get_data() method
    with patch.object(dao, "get_data") as mock_get_data:
        # Configure the mock behavior
        mock_get_data.return_value = 10.0

        # Call the method under test
        result = dao.get_data()

        # Verify the expected behavior
        assert result == 10.0
        mock_get_data.assert_called_once()


def test_dao_get_data_raises_type_error():
    """Test that get_data raises TypeError when called directly on DAO."""
    # Direct instantiation of DAO abstract class must throw TypeError
    with pytest.raises(TypeError, match="Can't instantiate abstract class"):
        DAO().get_data()


if __name__ == "__main__":
    pytest.main([__file__])
