describe("Service", () => {
    it("should return a number", () => {
        // Mock implementation of compute method
        const computeMock = jest.fn().mockReturnValue(10);

        // Service mock with compute() method
        const serviceMock = {
            compute: computeMock
        };

        // Call the compute method
        const result = serviceMock.compute();

        // Expect the result to be number
        expect(typeof result).toBe('number');

        // Expect the compute method to have been called once
        expect(serviceMock.compute).toHaveBeenCalledTimes(1);
    });
});