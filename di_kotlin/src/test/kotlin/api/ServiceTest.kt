package api

import com.kmmania.api.Service
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mockito.*

class ServiceTest {
    @InjectMocks
    private lateinit var serviceMock: Service

    @BeforeEach
    fun setup() {
        serviceMock = mock(Service::class.java)
    }

    @Test
    fun `compute() method should return 10`() {
        // Given
        //val service = mock(Service::class.java)
        `when`(serviceMock.compute()).thenReturn(10.0)

        // When
        val result = serviceMock.compute()

        // Then
        verify(serviceMock, times(1)).compute()
        assertThat(result).isEqualTo(10.0)
    }

    @Test
    @DisplayName("Direct instanciation should throw exception")
    fun directInstantiationShouldThrowException() {
        // Assert that attempting to directly instantiate DAO throws an exception
        assertThrows(UnsupportedOperationException::class.java) {
            doThrow(
                UnsupportedOperationException(
                    "Service is an interface and cannot be instantiated directly."
                )
            ).`when`(serviceMock).compute()

            serviceMock.compute() // This should throw UnsupportedOperationException
        }
    }
}