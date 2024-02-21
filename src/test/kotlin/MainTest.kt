import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {


    @Test
    @DisplayName("Testar os cenarios da portaria")
    fun testPortaria() {

        Assertions.assertEquals(portaria(15,"",""), "Negado.")

    }

}