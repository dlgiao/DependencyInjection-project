/**
 * Implementation of Service interface for MAS (Maximal Aerobic Speed) data.
 *
 * This service computes a percentage of the Maximal Aerobic Speed.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 * @since 0.1
 */
const Service = require("../api/Service");

class ServiceImplMAS extends Service {
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
     * Computes 70% of the Maximal Aerobic Speed.
     *
     * @returns {number} The result of the computation.
     */
    compute() {
        console.log("Service computes 70% of MAS");
        const data = this.dao.getData();
        return data * 0.70;
    }
}

module.exports = ServiceImplMAS;