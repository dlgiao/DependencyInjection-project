package hr

import com.kmmania.api.DAO
import com.kmmania.hr.DAOImplHR
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mockito.*

class DAOImplHRTest {
    @InjectMocks
    private lateinit var daoMock: DAO

    @BeforeEach
    fun setUp() {
        daoMock = mock(DAOImplHR::class.java)
    }

    @Test
    fun `getData() method should retrieve data from DAO`() {
        // Given
        `when`(daoMock.getData()).thenReturn(185.0)

        // When
        val result = daoMock.getData()

        // Then
        verify(daoMock, times(1)).getData()
        assertThat(result).isEqualTo(185.0)
    }
}