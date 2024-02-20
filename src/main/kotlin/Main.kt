fun countXO(str: String): Boolean {
    val strLower = str.lowercase()

    var i = 0
    var countX = 0
    var countO = 0
    while (i < strLower.length) {
        if (strLower[i] == 'x') {
            countX++
        } else if (strLower[i] == 'o') {
            countO++
        }
        i++
    }

    return countO == countX && countO != 0
}

fun abc(): Boolean {
    // e existe assim do jeito de um codigo
    // ** vale lembrar que esse codigo feito aqui é so pra forçar um NullPointerException()
    val str: String? = null
    return str!!.length == 0

    // existe 2 tipos para exeçoes, da pra fazer capturando assim do jeito mais pratico
    // throw NullPointerException()
}
fun main() {
    abc()
}