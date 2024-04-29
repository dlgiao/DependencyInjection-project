// Package api defines the interfaces required for dependency injection.
package api

// Dao is the interface for Data Access Object.
// Implement this interface to provide methods for accessing data.
type Dao interface {
	// GetData retrieves the data and returns a float64.
	GetData() float64
}

// Service is the Interface that performs computation based on data provided by a Dao (Data Access Object).
// Implement this interface to provide methods for computing data.
type Service interface {
	// Compute performs computations based on the data retrieved by the Dao and returns a float64.
	Compute() float64
}
