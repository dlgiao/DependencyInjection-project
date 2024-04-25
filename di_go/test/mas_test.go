package test

import (
	"kmmania.com/di_go/mas"
	"testing"
)

// MockDaoImplMAS is a mock implementation of Dao for testing purposes.
type MockDaoImplMAS struct{}

// GetData retrieves dummy data for testing.
func (dao MockDaoImplMAS) GetData() float64 {
	return 20.0 // You can change this value to any desired test data
}

func TestMASGetData(t *testing.T) {
	// Create a mock Dao instance
	mockDao := MockDaoImplMAS{}

	// Call GetData method on the mock Dao
	result := mockDao.GetData()

	// Check if the result matches the expected value
	expected := 20.0 // You need to define the expected result based on the test data
	if result != expected {
		t.Errorf("GetData() returned %f, expected %f", result, expected)
	}
}

func TestMASCompute(t *testing.T) {
	// Create a mock Dao instance
	mockDao := MockDaoImplMAS{}

	// Create a Service instance with the mock Dao
	service := mas.ServiceImplMas{Dao: mockDao}

	// Call Compute method on the Service
	result := service.Compute()

	// Check if the result matches the expected value
	expected := 14.0 // 70% of 20
	if result != expected {
		t.Errorf("Compute() returned %f, expected %f", result, expected)
	}
}
