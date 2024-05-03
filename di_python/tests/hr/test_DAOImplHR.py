from src.hr.DAOImplHR import DAOImplHR


class TestDAOImplHR:
    def setup_method(self, method):
        print(f"Setting up {method}")
        self.DAOImplHR = DAOImplHR()

    def teardown_method(self, method):
        print(f"Tearing down {method}")
        del self.DAOImplHR

    def test_get_data(self):
        assert self.DAOImplHR.get_data() == 185
