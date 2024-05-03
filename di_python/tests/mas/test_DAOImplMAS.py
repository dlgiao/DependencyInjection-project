from src.mas.DAOImplMAS import DAOImplMAS


class TestDAOImplMAS:
    def setup_method(self, method):
        print(f"Setting up {method}")
        self.DAOImplMAS = DAOImplMAS()

    def teardown_method(self, method):
        print(f"Tearing down {method}")
        del self.DAOImplMAS

    def test_compute(self):
        assert self.DAOImplMAS.get_data() == 17.5
