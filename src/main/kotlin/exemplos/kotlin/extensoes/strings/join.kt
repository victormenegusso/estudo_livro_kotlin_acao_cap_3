package exemplos.kotlin.extensoes.strings

fun <T> Collection<T>.joinToString(
                     separator: String = "",
                     prefix: String = "",
                     postfix: String = ""
) : String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main() {
    val list = arrayListOf(1, 7, 53)
    println(list.joinToString("; ", "(", ")"))
}