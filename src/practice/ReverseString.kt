package practice

fun main() {
    println("${reverseString(charArrayOf('h', 'e', 'l', 'l', 'o'))}")
}

fun reverseString(s: CharArray) {
    val size = s.size - 1
    var a: Char
    for (n in 0..size / 2) {
        a = s[n]
        s[n] = s[size - n]
        s[size - n] = a
    }
    println(s.joinToString())
}