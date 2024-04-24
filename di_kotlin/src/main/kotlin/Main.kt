/*
 * Dependency injection project.
 * Dac Linh Giao NGUYEN
 * License MIT
 *
 * Dependency injection project in Kotlin.
 * Main.kt
 */
package com.kmmania

import com.kmmania.api.DAO
import com.kmmania.api.Service
import com.kmmania.hr.DAOImplHR
import com.kmmania.hr.ServiceImplHR
import com.kmmania.mas.DAOImplMAS
import com.kmmania.mas.ServiceImplMAS

/**
 * Main function to demonstrate the usage of MAS (Maximal Aerobic Speed) and HR (Heart Rate) services.
 *
 * @author Dac Linh Giao NGUYEN
 * @since 0.1
 */
fun main() {
    createMASService()
    createHRService()
}

/**
 * Function to create and utilize the MAS (Maximal Aerobic Speed) service.
 *
 * It retrieves data from MAS data source and computes easy jog speed based on MAS.
 *
 * @since 0.1
 * @see DAOImplMAS
 * @see ServiceImplMAS
 */
private fun createMASService() {
    println("*** Easy jog speed by MAS ***")
    val daoMAS: DAO = DAOImplMAS()
    val serviceMAS: Service = ServiceImplMAS(daoMAS)
    val resultMAS = serviceMAS.compute()
    println("Compute easy jog by MAS: $resultMAS km/h")
    println("*** END ***")
}

/**
 * Function to create and utilize the HR (Heart Rate) service.
 *
 * It retrieves data from HR data source and computes easy jog heart rate based on HR.
 *
 * @since 0.1
 * @see DAOImplHR
 * @see ServiceImplHR
 */
private fun createHRService() {
    println("*** Easy jog by HR ***")
    val daoHR: DAO = DAOImplHR()
    val serviceHR: Service = ServiceImplHR(daoHR)
    val resultHR = serviceHR.compute()
    println("Compute easy jog by HR: $resultHR bpm")
    println("*** END ***")
}