package hr

import (
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/mock"
	"testing"
)

// MockDaoImplHr is a mock implementation of Dao for testing purposes.
type MockDaoImplHr struct {
	mock.Mock
}

// GetData retrieves dummy data for testing.
func (dao *MockDaoImplHr) GetData() float64 {
	return 200 // You can change this value to any desired test data
}

func TestHRGetData(t *testing.T) {
	// Given
	mockDao := MockDaoImplHr{}

	// When
	result := mockDao.GetData()

	// Then
	expected := 200.0
	assert.Equal(t, expected, result, "GetData() returned %f, expected %f", result, expected)
}

func TestHRCompute(t *testing.T) {
	// Given
	mockDao := MockDaoImplHr{}
	service := ServiceImplHr{Dao: &mockDao}

	// When
	result := service.Compute()

	// Then
	expected := 150.0 // 75% of 200
	assert.Equal(t, expected, result, "Compute() returned %f, expected %f", result, expected)
}
