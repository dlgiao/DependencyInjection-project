package api

import (
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/mock"
	"testing"
)

// MockDao is a mock implementation of Dao for testing purposes.
type MockDao struct {
	mock.Mock
}

// GetData retrieves dummy data for testing.
func (dao *MockDao) GetData() float64 {
	return 42.0
}

func TestGetData(t *testing.T) {
	// Given
	mockDao := MockDao{}

	// When
	result := mockDao.GetData()

	// Then
	expected := 42.0
	assert.Equal(t, expected, result, "GetData() returned %f, expected %f", result, expected)
}

// MockService is a mock implementation of Service for testing purposes.
type MockService struct {
	MockDao *MockDao
	mock.Mock
}

// Compute performs dummy computations for testing.
func (service *MockService) Compute() float64 {
	data := service.MockDao.GetData()
	return data * 10
}

func TestCompute(t *testing.T) {
	// Given
	mockDao := MockDao{}
	mockService := MockService{MockDao: &mockDao}

	// When
	result := mockService.Compute()

	// Then
	expected := 420.0
	assert.Equal(t, expected, result, "Compute() returned %f, expected %f", result, expected)
}
