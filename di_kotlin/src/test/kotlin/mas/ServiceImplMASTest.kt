package mas

import com.kmmania.api.DAO
import com.kmmania.api.Service
import com.kmmania.mas.DAOImplMAS
import com.kmmania.mas.ServiceImplMAS
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.*

class ServiceImplMASTest {
    @InjectMocks
    private lateinit var serviceMock: Service

    @Mock
    private lateinit var daoMock: DAO

    @BeforeEach
    fun setUp() {
        daoMock = mock(DAOImplMAS::class.java)
        serviceMock = mock(ServiceImplMAS::class.java)
    }

    @Test
    fun `compute() method should compute data from DAO`() {
        // Given
        `when`(daoMock.getData()).thenReturn(17.5)
        `when`(serviceMock.compute()).thenReturn(12.25)

        // When
        val resultDao = daoMock.getData()
        val resultMas = serviceMock.compute()

        // Then
        verify(daoMock, times(1)).getData()
        assertThat(resultDao).isEqualTo(17.5)
        verify(serviceMock, times(1)).compute()
        assertThat(resultMas).isEqualTo(12.25)
    }
}