/**
 * Main function to demonstrate the usage of MAS (Maximal Aerobic Speed) and HR (Heart Rate) services.
 *
 * @file Main file for dependency injection project implementation.
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 * @since 0.1
 */
const DAOImplMAS = require('./mas/DAOImplMAS');
const ServiceImplMAS = require('./mas/ServiceImplMAS');
const DAOImplHR = require('./hr/DAOImplHR');
const ServiceImplHR = require('./hr/ServiceImplHR');

/**
 * Function to create and utilize the MAS (Maximal Aerobic Speed) service.
 *
 * It retrieves data from MAS data source and computes easy jog speed based on MAS.
 */
function createMASService() {
    console.log("*** Easy jog speed by MAS ***");

    // Instantiates DAO and Service implementations
    const daoMAS = new DAOImplMAS();
    const serviceMAS = new ServiceImplMAS(daoMAS)

    // Computes and logs the result
    const resultMAS = serviceMAS.compute();
    console.log(`Compute easy jog by MAS: ${resultMAS}km/h`);

    console.log("*** End ***");
}

/**
 * Function to create and utilize the HR (Heart Rate) service.
 *
 * It retrieves data from HR data source and computes easy jog heart rate based on HR.
 */
function createHRService() {
    console.log("*** Easy jog HR ***");

    // Instantiates DAO and Service implementations
    const daoHR = new DAOImplHR();
    const serviceHR = new ServiceImplHR(daoHR);

    // Computes and logs the result
    const resultHR = serviceHR.compute();
    console.log(`Compute HR: ${resultHR}bpm`);

    console.log("*** End ***");
}

/**
 * Main function to demonstrate the usage of MAS (Maximal Aerobic Speed) and HR (Heart Rate) services.
 */
function main() {
    createMASService();
    createHRService();
}

main();
