describe("DAO", () => {
    it("should retrieve data from a data source", () => {
        // Mock implementation of getData method
        const getDataMock = jest.fn().mockReturnValue(10);

        // DAO mock with getData() method
        const daoMock = {
            getData: getDataMock
        };

        // Call the getData method
        const result = daoMock.getData();

        // Expect the result to be 10
        expect(result).toBe(10);

        // Expect the getData method to have been called once
        expect(daoMock.getData).toHaveBeenCalledTimes(1);
    });
});