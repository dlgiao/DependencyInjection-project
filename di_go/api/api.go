// Package api defines the interfaces required for dependency injection.
package api

/**
 * Interface for Data Access Object (DAO).
 * Implement this interface to provide methods for accessing data.
 */

type Dao interface {
	// GetData retrieves the data and returns a float64.
	GetData() float64
}

/**
 * Interface for a service that performs computation based on data provided by a DAO (Data Access Object).
 *
 * Implement this interface to provide methods for computing data.
 */

type Service interface {
	// Compute performs computations based on the data retrieved by the Dao and returns a float64.
	Compute() float64
}
