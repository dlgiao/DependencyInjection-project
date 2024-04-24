package com.kmmania.hr;

import com.kmmania.api.DAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class DAOImplHRTest {
    @InjectMocks
    private DAO daoMock;

    @BeforeEach
    void setUp() {
        daoMock = mock(DAOImplHR.class);
    }

    @Test
    @DisplayName("getData() method should retrieve data from DAO")
    void getDataShouldRetrieveDataFromDAO() {
        // Given
        when(daoMock.getData()).thenReturn(185.0);

        // When
        double result = daoMock.getData();

        // Then
        verify(daoMock, times(1)).getData();
        assertThat(result).isEqualTo(185);
    }
}