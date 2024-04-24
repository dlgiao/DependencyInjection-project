const ServiceImplHR = require("../../src/hr/ServiceImplHR");
const DAOImplHR = require("../../src/hr/DAOImplHR");

// Mock DAO
class MockDAO extends DAOImplHR {
    getData() {
        // Mocking data retrieval
        return 185;
    }
}

describe("ServiceImplHR", () => {
    let service;

    beforeEach(() => {
        // Using mocked DAO for testing
        const dao = new MockDAO();
        service = new ServiceImplHR(dao);
    });

    it("should compute 75% of the retrieved data", () => {
        const result = service.compute();
        expect(result).toBe(138.75); // 75% of 185
    });

    it("should call DAO's getData method", () => {
        const spyGetData = jest.spyOn(service.dao, "getData");
        service.compute();
        expect(spyGetData).toHaveBeenCalled();
    });
});
