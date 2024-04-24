package com.kmmania.mas;

import com.kmmania.api.DAO;

/**
 * Implementation of DAO interface for MAS (Maximal Aerobic Speed) data.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 */
public class DAOImplMAS implements DAO {
    /**
     * Retrieves MAS data from the data source.
     *
     * @return the MAS as a double.
     */
    @Override
    public double getData() {
        System.out.println("Data source provides a MAS 17.5km/h");
        return 17.5;
    }
}
