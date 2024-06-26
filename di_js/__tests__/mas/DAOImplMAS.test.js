const DAOImplMAS = require('../../src/mas/DAOImplMAS');

describe('DAOImplMAS', () => {
    let daoImplMAS;

    beforeEach(() => {
        daoImplMAS = new DAOImplMAS();
    })

    describe('getData()', () => {
        it('should retrieve data from data source 1 and return 17.5', () => {
            const result = daoImplMAS.getData();
            expect(result).toBe(17.5);
        });

        it('should log a message indicating data retrieval from source 1', () => {
            const consoleSpy = jest.spyOn(console, 'log');
            daoImplMAS.getData();
            expect(consoleSpy).toHaveBeenCalledWith('Data source provides a MAS 17.5km/h');
            consoleSpy.mockRestore();
        });
    });
});
