from unittest import mock

from src.hr.ServiceImplHR import ServiceImplHR


class TestServiceImplHR:

    @mock.patch('src.api.DAO.DAO')
    def setup_method(self, method, mock_dao):
        print(f"Setting up {method}")
        mock_dao.get_data.return_value = 185
        self.service = ServiceImplHR(mock_dao)

    def teardown_method(self, method):
        print(f"Tearing down {method}")
        del self.service

    def test_compute(self):
        assert self.service.compute() == 185 * 0.75
