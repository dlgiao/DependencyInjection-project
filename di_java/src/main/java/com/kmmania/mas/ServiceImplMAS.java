package com.kmmania.mas;

import com.kmmania.api.DAO;
import com.kmmania.api.Service;

/**
 * Implementation of Service interface for MAS (Maximal Aerobic Speed) data.
 * This service computes a percentage of the Maximal Aerobic Speed.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 */
public class ServiceImplMAS implements Service {
    private final DAO dao;

    /**
     * Injects the specified DAO in ServiceImplV1.
     *
     * @param dao The DAO to be used by the service.
     */
    public ServiceImplMAS(DAO dao) {
        this.dao = dao;
    }

    /**
     * Computes 70% of the Maximal Aerobic Speed.
     *
     * @return 70% of the MAS as a double.
     */
    @Override
    public double compute() {
        System.out.println("Service computes 70% of MAS");
        double data = dao.getData();
        return data * 0.70;
    }
}
