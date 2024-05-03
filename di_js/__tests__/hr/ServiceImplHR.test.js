const ServiceImplHR = require("../../src/hr/ServiceImplHR");

const MockDao = jest.fn().mockImplementation(() => {
    return {
        getData: jest.fn().mockReturnValue(185)
    }
});

describe("ServiceImplHR", () => {
    let mockDao;
    let service;

    beforeEach(() => {
        mockDao = new MockDao();
        service = new ServiceImplHR(mockDao);
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
