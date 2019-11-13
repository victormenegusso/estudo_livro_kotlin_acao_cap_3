package exemplos.kotlin

fun main() {
    val set = hashSetOf(1, 2, 3)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    list.add(1)
    println(list)

    set.add(4)
    print(set)

    val strings = listOf("first", "second", "fourteenth")
    println(strings.javaClass)
    println(strings.last())

    val numbers = setOf(1, 14, 2)
    println(numbers.max())



    print("a".victor("b"))

    print("a" victor "b")
}

infix fun String.victor(t: String) : String {
    return this + t
}
