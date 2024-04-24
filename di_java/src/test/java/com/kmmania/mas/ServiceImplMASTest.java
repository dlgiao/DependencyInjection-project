package com.kmmania.mas;

import com.kmmania.api.DAO;
import com.kmmania.api.Service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class ServiceImplMASTest {
    @InjectMocks
    private Service serviceMock;

    @Mock
    private DAO daoMock;

    @BeforeEach
    public void setUp() {
        daoMock = mock(DAOImplMAS.class);
        serviceMock = mock(ServiceImplMAS.class);
    }

    @Test
    @DisplayName("compute() method should compute data from DAO")
    void computeShouldComputeDataFromDAO() {
        // Given
        when(daoMock.getData()).thenReturn(17.5);
        when(serviceMock.compute()).thenReturn(12.25);

        // When
        double resultDao = daoMock.getData();
        double resultMas = serviceMock.compute();

        // Then
        verify(daoMock, times(1)).getData();
        assertThat(resultDao).isEqualTo(17.5); // Expected MAS value provided by DAO
        verify(serviceMock, times(1)).compute();
        assertThat(resultMas).isEqualTo(12.25); // Expected result is 70% of 17.5
    }
}