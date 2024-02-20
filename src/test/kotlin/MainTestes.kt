import org.junit.jupiter.api.*

class MainTestes {


    @Test
    //visualização
    @DisplayName("Teste metodo xxoo")
    fun testCountXO() {
        Assertions.assertAll(
            { Assertions.assertTrue(countXO("xxoo")) },
            { Assertions.assertTrue(countXO("xxoO")) }
        )
    }

    @Test
    // como desabilitar um teste p/ nao rodar basicamente
    @Disabled
    fun naoImplementado() {

    }

    @Test
    // como falhar um teste caso a implementação nao esteja feita.
    fun vaiFalhar() {
        fail("Não posso terminar os testes sem esse metodo.")
    }

    @Test
    // posso assumir alguma coisa, uma suposição de alguma coisa
    fun assumption() {
        /* aqui so vai rodar o resto desse codigo, ou seja, o codigo que esta pra baixo, se o "assertTrue" for realmente "True",
            ou seja, quero rodar um teste, baseado numa condição.
         */
        Assertions.assertTrue(countXO("xxoo"))

        //
        Assertions.assertTrue(abc())
    }

    @Test
    // teste para exceção
    fun exception() {
        // dentro dessa <> devemos por qual exceção estamos esperando, no caso o NullPointerException
        assertThrows<NullPointerException> { abc() }
    }
}