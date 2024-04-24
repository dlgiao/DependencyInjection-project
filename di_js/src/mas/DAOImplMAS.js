/**
 * Implementation of DAO interface for MAS (Maximal Aerobic Speed) data.
 *
 * @author Dac Linh Giao NGUYEN
 * @extends DAO
 * @version 0.1
 * @since 0.1
 */
const DAO = require("../api/DAO")

class DAOImplMAS extends DAO {
    /**
     * Retrieves data from data source 1.
     *
     * @returns {number} The retrieved data representing a speed.
     */
    getData() {
        console.log("Data source provides a MAS 17.5km/h");
        return 17.5;
    }
}

module.exports = DAOImplMAS;