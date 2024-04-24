package api

import com.kmmania.api.DAO
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mockito.*

class DAOTest {
    @InjectMocks
    private lateinit var daoMock: DAO

    @BeforeEach
    fun setUp() {
        daoMock = mock(DAO::class.java)
    }

    @Test
    fun `getData() method should return 10`() {
        // Given
        `when`(daoMock.getData()).thenReturn(10.0)

        // When
        val result = daoMock.getData()

        // Then
        verify(daoMock, times(1)).getData()
        assertThat(result).isEqualTo(10.0)
    }

    @Test
    fun `Direct instanciation should throw exception`() {
        // Assert that attempting to directly instantiate DAO throws an exception
        assertThrows(UnsupportedOperationException::class.java) {
            doThrow(
                UnsupportedOperationException(
                    "DAO is an interface and cannot be instantiated directly."
                )
            ).`when`(daoMock).getData()

            daoMock.getData() // This should throw UnsupportedOperationException
        }
    }
}