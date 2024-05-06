package mas

import (
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/mock"
	"testing"
)

// MockDaoImplMAS is a mock implementation of Dao for testing purposes.
type MockDaoImplMAS struct {
	mock.Mock
}

// GetData retrieves dummy data for testing.
func (dao *MockDaoImplMAS) GetData() float64 {
	return 20.0
}

func TestMASGetData(t *testing.T) {
	// Given
	mockDao := MockDaoImplMAS{}

	// When
	result := mockDao.GetData()

	// Then
	expected := 20.0
	assert.Equal(t, expected, result, "GetData() returned %f, expected %f", result, expected)
}

func TestMASCompute(t *testing.T) {
	// Given
	mockDao := MockDaoImplMAS{}
	service := ServiceImplMas{Dao: &mockDao}

	// When
	result := service.Compute()

	// Then
	expected := 14.0 // 70% of 20
	assert.Equal(t, expected, result, "Compute() returned %f, expected %f", result, expected)
}
