import com.kmmania.main
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainKtTest {
    @Test
    fun `Main method should print correct output`() {
        // Given
        val expectedOutput = """
*** Easy jog speed by MAS ***
Service computes 70% of MAS
Data source provides a MAS 17.5km/h
Compute easy jog by MAS: 12.25 km/h
*** END ***
*** Easy jog by HR ***
Service computes 75% of max heart rate
Data source provides a max heart rate 185bpm
Compute easy jog by HR: 138.75 bpm
*** END ***
""".trimIndent()

        // When
        val output = captureOutput { main() }

        // Then
        assertThat(output).isEqualTo(expectedOutput)
    }

    // Function to capture console output
    private fun captureOutput(block: () -> Unit): String {
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        try {
            block()
            val output = outputStream.toString().trim()
            // Filter lines containing "*** END ***", but keep the line itself
            return output.lines()
                .joinToString("\n") {
                    if (it.contains("*** END ***")) it else it.trim()
                }
        } finally {
            System.setOut(System.out)
        }
    }
}