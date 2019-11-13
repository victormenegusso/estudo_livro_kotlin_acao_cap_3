package exemplos.kotlin
/*
fun <T> joinToString(collection: Collection<T>,
                     separator: String,
                     prefix: String,
                     postfix: String
) : String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}
*/

fun <T> joinToString(collection: Collection<T>,
                     separator: String = "",
                     prefix: String = "",
                     postfix: String = ""
) : String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main() {
    val list = arrayListOf(1, 7, 53)

    println(joinToString(list, "; ", "(", ")"))
    println(joinToString(list, " ", " ", "."))
    println(joinToString(list, separator = " ", prefix = " ", postfix = "."))

    println(joinToString(list))
    println(joinToString(list, ""))
    println(joinToString(list, prefix = " ", postfix = "."))
}