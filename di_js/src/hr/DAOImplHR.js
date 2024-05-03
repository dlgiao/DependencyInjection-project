/**
 * Implementation of DAO interface for HR (heart rate) data.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 * @since 0.1
 */
const DAO = require("../api/DAO");

class DAOImplHR extends DAO {
    /**
     * Retrieves the maximum heart rate (HR) from the HR data source.
     *
     * @returns {number} The retrieved data representing a maximum heart rate.
     */
    getData() {
        console.log("Data source provides a max heart rate 185bpm");
        return 185;
    }
}

module.exports = DAOImplHR;