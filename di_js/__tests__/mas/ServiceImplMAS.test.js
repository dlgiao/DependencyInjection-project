const ServiceImplMAS = require("../../src/mas/ServiceImplMAS");

const MockDao = jest.fn().mockImplementation(() => {
    return {
        getData: jest.fn().mockReturnValue(17.5)
    }
});

describe("ServiceImplMAS", () => {
    let mockDao;
    let service;

    beforeEach(() => {
        mockDao = new MockDao()
        service = new ServiceImplMAS(mockDao);
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
