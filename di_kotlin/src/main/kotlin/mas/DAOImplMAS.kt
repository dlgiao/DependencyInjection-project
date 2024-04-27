/*
 * Dependency injection project.
 * Dac Linh Giao NGUYEN
 * License MIT
 *
 * Dependency injection project in Kotlin.
 * DAOImplMAS.kt
 */
package com.kmmania.mas

import com.kmmania.api.DAO

/**
 * Implementation of DAO interface for MAS (Maximal Aerobic Speed) data.
 *
 * @constructor Creates a [DAOImplMAS] instance.
 * @author Dac Linh Giao NGUYEN
 * @since 0.1
 * @see DAO
 */
class DAOImplMAS : DAO {
    /**
     * Retrieves the Maximal Aerobic Speed (MAS) from the MAS data source.
     * @return the MAS as a Double.
     */
    override fun getData(): Double {
        println("Data source provides a MAS 17.5km/h")
        return 17.5
    }
}