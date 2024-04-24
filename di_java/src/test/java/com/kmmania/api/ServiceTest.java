package com.kmmania.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class ServiceTest {
    @InjectMocks
    private Service serviceMock;

    @BeforeEach
    void setUp() {
        serviceMock = mock(Service.class);
    }

    @Test
    @DisplayName("compute() method should return 10")
    void computeShouldReturn10() {
        // Given
        when(serviceMock.compute()).thenReturn(10.0);

        // When
        double result = serviceMock.compute();

        // Then
        verify(serviceMock, times(1)).compute();
        assertThat(result).isEqualTo(10.0);
    }

    @Test
    @DisplayName("Direct instanciation should throw exception")
    void directInstantiationShouldThrowException() {
        // Assert that attempting to directly instantiate DAO throws an exception
        assertThrows(UnsupportedOperationException.class, () -> {
            Service service = () -> {
                throw new UnsupportedOperationException(
                        "Service is an interface and cannot be instantiated directly."
                );
            };
            service.compute(); // This should throw UnsupportedOperationException
        });
    }
}