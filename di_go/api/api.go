// Package api defines the interfaces required for dependency injection.
package api

/*
 * Dao defines the interface for Data Access Object (DAO).
 * Implement this interface to provide methods for accessing data.
 */

type Dao interface {
	// GetData retrieves the data and returns a float64.
	GetData() float64
}
