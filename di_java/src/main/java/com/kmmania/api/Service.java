package com.kmmania.api;

/**
 * Interface for a service that performs computation based on data provided by a DAO (Data Access Object).
 * Implement this interface to provide methods for computing data.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 */
public interface Service {
    /**
     * Method to perform a calculation based on data provided by a DAO.
     *
     * @return the computed result as a double.
     */
    double compute();
}
