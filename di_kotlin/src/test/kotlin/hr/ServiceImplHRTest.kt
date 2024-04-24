package hr

import com.kmmania.api.DAO
import com.kmmania.api.Service
import com.kmmania.hr.DAOImplHR
import com.kmmania.hr.ServiceImplHR
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.*

class ServiceImplHRTest {
    @InjectMocks
    private lateinit var serviceMock: Service

    @Mock
    private lateinit var daoMock: DAO

    @BeforeEach
    fun setUp() {
        daoMock = mock(DAOImplHR::class.java)
        serviceMock = mock(ServiceImplHR::class.java)
    }

    @Test
    fun `compute() method should compute data from DAO`() {
        // Given
        `when`(daoMock.getData()).thenReturn(185.0)
        `when`(serviceMock.compute()).thenReturn(138.75)

        // When
        val resultDao = daoMock.getData()
        val resultHr = serviceMock.compute()

        // Then
        verify(daoMock, times(1)).getData()
        assertThat(resultDao).isEqualTo(185.0)
        verify(serviceMock, times(1)).compute()
        assertThat(resultHr).isEqualTo(138.75)
    }
}