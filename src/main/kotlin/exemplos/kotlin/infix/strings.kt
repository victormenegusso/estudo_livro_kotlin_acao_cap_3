package exemplos.kotlin.infix

infix fun String.concatenar(t: String) : String {
    return this + t
}

fun main() {

    println( "A" concatenar "B" )

    println( "A".concatenar("B") )
}