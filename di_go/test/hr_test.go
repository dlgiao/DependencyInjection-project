package test

import (
	"kmmania.com/di_go/hr"
	"testing"
)

// MockDaoImplHr is a mock implementation of Dao for testing purposes.
type MockDaoImplHr struct{}

// GetData retrieves dummy data for testing.
func (dao MockDaoImplHr) GetData() float64 {
	return 200 // You can change this value to any desired test data
}

func TestHRGetData(t *testing.T) {
	// Create a mock Dao instance
	mockDao := MockDaoImplHr{}

	// Call GetData method on the mock Dao
	result := mockDao.GetData()

	// Check if the result matches the expected value
	expected := 200.0 // You need to define the expected result based on the test data
	if result != expected {
		t.Errorf("GetData() returned %f, expected %f", result, expected)
	}
}

func TestHRCompute(t *testing.T) {
	// Create a mock Dao instance
	mockDao := MockDaoImplHr{}

	// Create a Service instance with the mock Dao
	service := hr.ServiceImplHr{Dao: mockDao}

	// Call Compute method on the Service
	result := service.Compute()

	// Check if the result matches the expected value
	expected := 150.0 // 75% of 200
	if result != expected {
		t.Errorf("Compute() returned %f, expected %f", result, expected)
	}
}
