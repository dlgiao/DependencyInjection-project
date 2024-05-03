from unittest import mock


class TestService:

    @mock.patch("src.api.Service.Service")
    def setup_method(self, method, mock_service):
        print(f"Setting up {method}")
        mock_service.compute.return_value = 10.0
        self.service = mock_service

    def teardown_method(self, method):
        print(f"Tearing down {method}")

    def test_compute(self):
        assert self.service.compute() == 10.0
