/*
 * Dependency injection project.
 * Dac Linh Giao NGUYEN
 * License MIT
 *
 * Dependency injection project in Kotlin.
 * Service.kt
 */
package com.kmmania.api

/**
 * Interface for a service that performs computation based on data provided by a DAO (Data Access Object).
 *
 * Implement this interface to provide methods for computing data.
 *
 * @author Dac Linh Giao NGUYEN
 * @since 0.1
 * @see DAO
 */
interface Service {
    /**
     * Method to compute a result.
     *
     * @return the computed result as a Double.
     */
    fun compute(): Double
}