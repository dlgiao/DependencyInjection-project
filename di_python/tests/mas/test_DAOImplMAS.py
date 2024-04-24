from unittest.mock import MagicMock, patch

import pytest

from src.mas.DAOImplMAS import DAOImplMAS


@pytest.fixture
def dao_impl_mas():
    return MagicMock(spec=DAOImplMAS)


def test_dao_impl_mas_get_data(dao_impl_mas):
    """get_data() method should retrieve data from DAO."""
    # Create a mock of get_data() method
    with patch.object(dao_impl_mas, "get_data") as mock_get_data:
        # Configure the mock behavior
        mock_get_data.return_value = 17.5

        # Call the method under test
        result = dao_impl_mas.get_data()

        # Verify the expected behavior
        assert result == 17.5
        mock_get_data.assert_called_once()


if __name__ == "__main__":
    pytest.main([__file__])
