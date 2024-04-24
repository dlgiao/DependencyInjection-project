package mas

import com.kmmania.api.DAO
import com.kmmania.mas.DAOImplMAS
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mockito.*

class DAOImplMASTest {
    @InjectMocks
    private lateinit var daoMock: DAO

    @BeforeEach
    fun setUp() {
        daoMock = mock(DAOImplMAS::class.java)
    }

    @Test
    fun `getData() should retrieve data from DAO`() {
        // Given
        `when`(daoMock.getData()).thenReturn(17.5)

        // When
        val result = daoMock.getData()

        // Then
        verify(daoMock, times(1)).getData()
        assertThat(result).isEqualTo(17.5)
    }
}