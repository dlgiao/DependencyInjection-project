package com.kmmania.hr;

import com.kmmania.api.DAO;

/**
 * Implementation of DAO interface for HR (heart rate) data.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 */
public class DAOImplHR implements DAO {
    /**
     * Retrieves the maximum heart rate (HR) from the HR data source.
     *
     * @return the maximum HR as a double.
     */
    @Override
    public double getData() {
        System.out.println("Data source provides a max heart rate 185bpm");
        return 185;
    }
}
