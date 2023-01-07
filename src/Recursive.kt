fun main() {

    val n = 5
   /* println("Fibonacci series of $n : ")
    for (i in 0 until n) {
        println("${fib(i)}")
    }*/

    println("Factorial of $n : ${factorial(n)}")
}

fun fib(n: Int): Int {
    if (n == 0) return 0
    return if (n == 1 || n == 2) 1
    else fib(n - 1) + fib(n - 2)
}

fun factorial(n: Int): Int {
    return if (n == 0 || n == 1) 1
    else n * factorial(n - 1)
}