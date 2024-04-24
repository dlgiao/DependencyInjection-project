package com.kmmania.hr;

import com.kmmania.api.DAO;
import com.kmmania.api.Service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class ServiceImplHRTest {
    @InjectMocks
    private Service serviceMock;

    @Mock
    private DAO daoMock;

    @BeforeEach
    void setUp() {
        daoMock = mock(DAOImplHR.class);
        serviceMock = mock(ServiceImplHR.class);
    }

    @Test
    @DisplayName("compute() method should compute data from DAO")
    void computeShouldComputeDataFromDAO() {
        // Given
        when(daoMock.getData()).thenReturn(185.0);
        when(serviceMock.compute()).thenReturn(138.75);

        // When
        double resultDAO = daoMock.getData();
        double resultService = serviceMock.compute();

        // Then
        verify(daoMock, times(1)).getData();
        assertThat(resultDAO).isEqualTo(185.0); // Expected HR max value provided by DAO
        verify(serviceMock, times(1)).compute();
        assertThat(resultService).isEqualTo(138.75); // Expected result is 75% of 185
    }
}