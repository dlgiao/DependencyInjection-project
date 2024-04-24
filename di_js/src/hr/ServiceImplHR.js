/**
 * Implementation of Service interface for HR data.
 *
 * This service computes a percentage of the maximum heart rate.
 *
 * @author Dac Linh Giao NGUYEN
 * @extends Service
 * @version 0.1
 * @since 0.1
 */
const Service = require("../api/Service");

class ServiceImplHR extends Service {
    /**
     * Constructs a new Service implementation with the provided DAO.
     *
     * @param {DAO} dao - The Data Access Object instance to be used for retrieving data.
     */
    constructor(dao) {
        super();
        this.dao = dao;
    }

    /**
     * Computes 75% of the retrieved data from the DAO.
     *
     * @returns {number} The result of the computation.
     */
    compute() {
        console.log("Service computes 75% of max heart rate");
        const data = this.dao.getData();
        return data * 0.75;
    }
}

module.exports = ServiceImplHR;