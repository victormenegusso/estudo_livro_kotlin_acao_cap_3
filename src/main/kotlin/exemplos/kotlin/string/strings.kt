package exemplos.kotlin.string

fun main() {

    // tendo escape de String ( como colocamos \ antes do . para não usar ele como coringa
    println( "12.345-6.A".split("\\.|-".toRegex() ) ) //[12, 345, 6, A]

    // sem escape
    println( "12.345-6.A".split("""\.|-""".toRegex() ) ) //[12, 345, 6, A]

    println("12.345-6.A".split(".", "-")) //[12, 345, 6, A]

    val textao = """Eu quero Café,
todo dia
toda hora
nice
"""

    println(textao)
}