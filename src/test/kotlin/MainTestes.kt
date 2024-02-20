import org.junit.jupiter.api.*

class MainTestes {


    @Test
    //visualização
    @DisplayName ("Teste metodo xxoo")
    fun testCountXO() {
        Assertions.assertAll(
            { Assertions.assertTrue(countXO("xxoo"))},
            { Assertions.assertTrue(countXO("xxoO"))}
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

}