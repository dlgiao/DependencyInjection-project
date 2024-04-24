package com.kmmania;

import com.kmmania.api.DAO;
import com.kmmania.api.Service;
import com.kmmania.hr.DAOImplHR;
import com.kmmania.hr.ServiceImplHR;
import com.kmmania.mas.DAOImplMAS;
import com.kmmania.mas.ServiceImplMAS;

/**
 * Main function to demonstrate the usage of MAS (Maximal Aerobic Speed) and HR (Heart Rate) services.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 */
public class Main {
    /**
     * The main method to run the application.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        createMASService();
        createHRService();
    }

    /**
     * Function to create and utilize the MAS (Maximal Aerobic Speed) service.
     * It retrieves data from MAS data source and computes easy jog speed based on MAS.
     */
    private static void createMASService() {
        System.out.println("*** Easy jog speed by MAS ***");
        DAO daoMAS = new DAOImplMAS();
        Service serviceMAS = new ServiceImplMAS(daoMAS);
        double resultMAS = serviceMAS.compute();
        System.out.printf("Compute easy jog by MAS: %s km/h\n", resultMAS);
        System.out.println("*** End ***");
    }

    /**
     * Function to create and utilize the HR (Heart Rate) service.
     * It retrieves data from HR data source and computes easy jog heart rate based on HR.
     */
    private static void createHRService() {
        System.out.println("*** Easy jog by HR ***");
        DAO daoHR = new DAOImplHR();
        Service serviceHR = new ServiceImplHR(daoHR);
        double resultHR = serviceHR.compute();
        System.out.printf("Compute easy jog by HR: %s bpm\n", resultHR);
        System.out.println("*** End ***");
    }
}