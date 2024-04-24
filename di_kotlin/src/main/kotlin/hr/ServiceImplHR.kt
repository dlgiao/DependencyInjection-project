/*
 * Dependency injection project.
 * Dac Linh Giao NGUYEN
 * License MIT
 *
 * Dependency injection project in Kotlin.
 * ServiceImplHR.kt
 */
package com.kmmania.hr

import com.kmmania.api.DAO
import com.kmmania.api.Service

/**
 * Implementation of Service interface for HR data.
 *
 * This service computes a percentage of the maximum heart rate.
 *
 * @param dao the DAO implementation providing access to HR data.
 * @author Dac Linh Giao NGUYEN
 * @since 0.1
 * @see Service
 */
class ServiceImplHR(private val dao: DAO) : Service {
    /**
     * Computes 75% of the maximum heart rate.
     *
     * @return 75% of the maximum HR as a Double.
     */
    override fun compute(): Double {
        println("Service computes 75% of max heart rate")
        val data = dao.getData()
        return data * 0.75
    }
}