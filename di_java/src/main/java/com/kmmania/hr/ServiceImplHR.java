package com.kmmania.hr;

import com.kmmania.api.DAO;
import com.kmmania.api.Service;

/**
 * Implementation of Service interface for HR data.
 * This service computes a percentage of the maximum heart rate.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 */
public class ServiceImplHR implements Service {
    private final DAO dao;

    /**
     * Injects the specified DAO in ServiceImplHR.
     *
     * @param dao The DAO to be used by the service.
     */
    public ServiceImplHR(DAO dao) {
        this.dao = dao;
    }

    /**
     * Computes 75% of the maximum heart rate.
     *
     * @return 75% of the maximum HR as a double.
     */
    @Override
    public double compute() {
        System.out.println("Service computes 75% of max heart rate");
        double data = dao.getData();
        return data * 0.75;
    }
}
