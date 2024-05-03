from unittest import mock


class TestDAO:

    @mock.patch("src.api.DAO.DAO")
    def setup_method(self, method, mock_dao):
        print(f"Setting up {method}")
        mock_dao.get_data.return_value = 10.0
        self.dao = mock_dao

    def teardown_method(self, method):
        print(f"Tearing down {method}")
        del self.dao

    def test_get_data(self):
        assert self.dao.get_data() == 10.0
