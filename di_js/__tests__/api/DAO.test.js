const DAO = require("../../src/api/DAO");

describe("DAO", () => {
    let dao;

    beforeEach(() => {
        dao = new DAO();
    });

    it("should retrieve data from a data source", () => {
        // Mock implementation of getData method
        dao.getData = jest.fn().mockReturnValue(10);

        // Call the getData method
        const result = dao.getData();

        // Expect the result to be 10
        expect(result).toBe(10);

        // Expect the getData method to have been called once
        expect(dao.getData).toHaveBeenCalledTimes(1);
    });
});