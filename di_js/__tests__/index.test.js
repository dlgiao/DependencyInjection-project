const DAOImplMAS = require('../src/mas/DAOImplMAS');
const ServiceImplMAS = require('../src/mas/ServiceImplMAS');
const DAOImplHR = require('../src/hr/DAOImplHR');
const ServiceImplHR = require('../src/hr/ServiceImplHR');

describe("MAS Implementation", () => {
    let daoMAS, serviceMAS;

    beforeEach(() => {
        daoMAS = new DAOImplMAS();
        serviceMAS = new ServiceImplMAS(daoMAS);
    });

    it("should compute easy jog speed", () => {
        const resultMAS = serviceMAS.compute();
        expect(resultMAS).toBe(12.25); // Assuming compute() returns 7 km/h
    });
});

describe("HR Implementation", () => {
    let daoHR, serviceHR;

    beforeEach(() => {
        daoHR = new DAOImplHR();
        serviceHR = new ServiceImplHR(daoHR);
    });

    it("should compute heart rate", () => {
        const resultHR = serviceHR.compute();
        expect(resultHR).toBe(138.75); // Assuming compute() returns 138.75 bpm
    });
});