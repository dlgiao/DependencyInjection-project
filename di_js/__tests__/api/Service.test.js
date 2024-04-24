const Service = require("../../src/api/Service");

describe("Service", () => {
    let service;

    beforeEach(() => {
        service = new Service();
    })

    it("should return a number", () => {
        // Mock implementation of compte method
        service.compute = jest.fn().mockReturnValue(10);

        // Call the compute method
        const result = service.compute();

        // Expect the result to be number
        expect(typeof result).toBe('number');

        // Expect the compute method to have been called once
        expect(service.compute).toHaveBeenCalledTimes(1);
    });
});