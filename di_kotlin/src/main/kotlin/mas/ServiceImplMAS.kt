/*
 * Dependency injection project.
 * Dac Linh Giao NGUYEN
 * License MIT
 *
 * Dependency injection project in Kotlin.
 * ServiceImplMAS.kt
 */
package com.kmmania.mas

import com.kmmania.api.DAO
import com.kmmania.api.Service

/**
 * Implementation of Service interface for MAS (Maximal Aerobic Speed) data.
 *
 * This service computes a percentage of the Maximal Aerobic Speed.
 *
 * @param dao the DAO implementation providing access to MAS data.
 * @author Dac Linh Giao NGUYEN
 * @since 0.1
 * @see Service
 */
class ServiceImplMAS(private val dao: DAO) : Service {
    /**
     * Computes 70% of the Maximal Aerobic Speed.
     *
     * @return 70% of the MAS as a Double.
     */
    override fun compute(): Double {
        println("Service computes 70% of MAS")
        val data = dao.getData()
        return data * 0.70
    }
}