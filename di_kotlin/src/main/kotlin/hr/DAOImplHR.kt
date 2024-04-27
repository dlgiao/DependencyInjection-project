/*
 * Dependency injection project.
 * Dac Linh Giao NGUYEN
 * License MIT
 *
 * Dependency injection project in Kotlin.
 * DAOImplHR.kt
 */
package com.kmmania.hr

import com.kmmania.api.DAO

/**
 * Implementation of the [DAO] interface for HR (heart rate) data.
 *
 * This class provides functionality to retrieve the maximum heart rate from the HR data source.
 *
 * @constructor Creates a [DAOImplHR] instance.
 * @author Dac Linh Giao NGUYEN
 * @since 0.1
 * @see DAO
 */
class DAOImplHR : DAO {
    /**
     * Retrieves the maximum heart rate (HR) from the HR data source.
     *
     * @return the maximum HR as a Double.
     */
    override fun getData(): Double {
        println("Data source provides a max heart rate 185bpm")
        return 185.0
    }
}