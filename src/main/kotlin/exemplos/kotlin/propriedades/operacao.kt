package exemplos.kotlin.propriedades

var opCount = 0

fun performOperation() {
    opCount++
    // ....
}

fun reportOperationCount() {
    println("Operation performed $opCount times")
}

const val OPERATION_SYSTEM_VERSION = "1.0"
