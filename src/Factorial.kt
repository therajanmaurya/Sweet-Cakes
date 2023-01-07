

fun main() {
    println("Factorial While Look: ${factorialWhile(5)}")
}

fun factorialWhile(n: Int): Int {
    if (n == 0) return 1
    var i = n
    var fact = 1
    while (n / i != n) {
        fact *= i
        i--
    }
    return fact
}
