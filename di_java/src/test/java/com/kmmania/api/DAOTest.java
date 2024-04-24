package com.kmmania.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class DAOTest {
    @InjectMocks
    private DAO daoMock;

    @BeforeEach
    void setUp() {
        daoMock = mock(DAO.class);
    }

    @Test
    @DisplayName("getData() method should return 10")
    void getDataShouldReturn10() {
        // Given
        when(daoMock.getData()).thenReturn(10.0);

        // When
        double result = daoMock.getData();

        // Then
        verify(daoMock, times(1)).getData();
        assertThat(result).isEqualTo(10.0);
    }

    @Test
    @DisplayName("Direct instanciation should throw exception")
    void directInstantiationShouldThrowException() {
        // Assert that attempting to directly instantiate DAO throws an exception
        assertThrows(UnsupportedOperationException.class, () -> {
            DAO dao = () -> {
                throw new UnsupportedOperationException(
                        "DAO is an interface and cannot be instantiated directly."
                );
            };
            dao.getData(); // This should throw UnsupportedOperationException
        });
    }
}
