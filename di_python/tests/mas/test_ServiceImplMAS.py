from unittest import mock

from src.mas.ServiceImplMAS import ServiceImplMAS


class TestServiceImplMAS:
    @mock.patch("src.api.DAO.DAO")
    def setup_method(self, method, mock_dao):
        print(f"Setting up {method}")
        mock_dao.get_data.return_value = 17.5
        self.service = ServiceImplMAS(mock_dao)

    def teardown_method(self, method):
        print(f"Tearing down {method}")
        del self.service

    def test_compute(self):
        assert self.service.compute() == 17.5 * 0.70
