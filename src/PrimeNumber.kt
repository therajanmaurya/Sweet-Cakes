import java.util.*

fun main() {
    /*val n = 20
    for (a in 0..n) {
        println("$a : ${seiveOfEratoSethenes(n)[a]}")
    }*/

    println("GCD: ${findGCD(83, 90)}")
}

fun findGCD(a: Int, b: Int): Int {
    return if (a % b == 0) b else findGCD(b, a % b)
}

fun seiveOfEratoSethenes(n: Int): BooleanArray {
    val isPrime = BooleanArray(n + 1)
    Arrays.fill(isPrime, true)
    isPrime[0] = false
    isPrime[1] = false
    var i = 2
    while (i * i <= n) {
        var j = 2 * i
        while (j <= n) {
            isPrime[j] = false
            j += i
        }
        i++
    }
    return isPrime
}

fun findPrimeIndexArray(n: Int): BooleanArray {
    val isPrime = BooleanArray(n + 1)
    Arrays.fill(isPrime, true)
    isPrime[0] = false
    isPrime[1] = false
    var i = 2
    while (i * i < n) {
        var j = 2 * i
        while (j <= n) {
            isPrime[j] = false
            j += i
        }
        i++
    }
    return isPrime
}
