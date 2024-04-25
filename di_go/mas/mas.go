// Package mas provides implementations for the Maximal Aerobic Speed (MAS).
package mas

import (
	"fmt"
	"kmmania.com/di_go/api"
)

// DaoImplMas is an implementation of the Dao interface specific to the MAS data source.
type DaoImplMas struct{}

// GetData retrieves the MAS data from the data source and returns it as a float64.
func (dao *DaoImplMas) GetData() float64 {
	fmt.Println("Data source provides a MAS 17.5km/h")
	return 17.5
}

// ServiceImplMas is an implementation of the Service interface specific to the MAS service.
type ServiceImplMas struct {
	Dao api.Dao
}

// Compute computes 70% of the MAS retrieved from the data source and returns it as a float64.
func (service *ServiceImplMas) Compute() float64 {
	fmt.Println("Service computes 70% of MAS")
	data := service.Dao.GetData()
	return data * 0.70
}
