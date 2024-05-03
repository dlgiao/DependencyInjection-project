const DAOImplHR = require('../../src/hr/DAOImplHR');

describe('DAOImplHR', () => {
    let daoImplHR;

    beforeEach(() => {
        daoImplHR = new DAOImplHR();
    });

    describe('getData()', () => {
        it('should retrieve data from data source HR and return 185', () => {
            const result = daoImplHR.getData();
            expect(result).toBe(185);
        });

        it('should log a message indicating data retrieval from source HR', () => {
            const consoleSpy = jest.spyOn(console, "log");
            daoImplHR.getData();
            expect(consoleSpy).toHaveBeenCalledWith('Data source provides a max heart rate 185bpm');
            consoleSpy.mockRestore();
        });
    });
});
