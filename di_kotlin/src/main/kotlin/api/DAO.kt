/*
 * Dependency injection project.
 * Dac Linh Giao NGUYEN
 * License MIT
 *
 * Dependency injection project in Kotlin.
 * DAO.kt
 */
package com.kmmania.api

/**
 * Interface for Data Access Object (DAO).
 *
 * Implement this interface to provide methods for accessing data.
 *
 * @author Dac Linh Giao NGUYEN
 * @since 0.1
 */
interface DAO {
    /**
     * Method to retrieve data.
     *
     * @return the retrieved data as a Double.
     */
    fun getData(): Double
}