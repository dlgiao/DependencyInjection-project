// Package hr provides implementations for the Heart Rate (HR) data source.
package hr

import (
	"fmt"
	"kmmania.com/di_go/api"
)

// DaoImplHr is an implementation of the Dao interface specific to the HR data source.
type DaoImplHr struct{}

// GetData retrieves the maximum heart rate from the data source and returns it as a float64.
func (dao *DaoImplHr) GetData() float64 {
	fmt.Println("Data source provides a max heart rate 185bpm")
	return 185
}

// ServiceImplHr is an implementation of the Service interface specific to the HR service.
type ServiceImplHr struct {
	Dao api.Dao
}

// Compute computes 75% of the maximum heart rate retrieved from the data source and returns
// it as a float64.
func (service *ServiceImplHr) Compute() float64 {
	fmt.Println("Service computes 75% of max heart rate")
	data := service.Dao.GetData()
	return data * 0.75
}
