const ServiceImplMAS = require("../../src/mas/ServiceImplMAS");
const DAOImplMAS = require("../../src/mas/DAOImplMAS");

// Mock DAO
class MockDAO extends DAOImplMAS {
    getData() {
        // Mocking data retrieval
        return 17.5;
    }
}

describe("ServiceImplMAS", () => {
    let service;

    beforeEach(() => {
        // Using mocked DAO for testing
        const dao = new MockDAO();
        service = new ServiceImplMAS(dao);
    });

    it("should compute 75% of the retrieved data", () => {
        const result = service.compute();
        expect(result).toBe(12.25); // 70% of 17.5
    });

    it("should call DAO's getData method", () => {
        const spyGetData = jest.spyOn(service.dao, "getData");
        service.compute();
        expect(spyGetData).toHaveBeenCalled();
    });
});
