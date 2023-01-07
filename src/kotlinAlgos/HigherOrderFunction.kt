package kotlinAlgos

fun main() {
    println(funAsParameter(1, 2, ::operation))
    val func = operation()                                      // 3
    println(func(2))
}

fun funAsParameter(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun operation(a: Int, b: Int): Int {
    return a + b
}

fun operation(): (Int) -> Int {                                     // 1
    return ::square
}

fun square(x: Int) = x * x                                          // 2