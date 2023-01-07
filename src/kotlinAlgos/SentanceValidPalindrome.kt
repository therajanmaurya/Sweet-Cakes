package kotlinAlgos

fun main() {
    println(sentenceValidPalindrome("0P"))
}

fun sentenceValidPalindrome(s: String): Boolean {
    var left = 0
    var right = s.length - 1
    val s = s.toLowerCase()

    while (left <= right) {
        if (s[left] !in 'a'..'z' && !s[left].isDigit()) {
            left++
        } else if (s[right] !in 'a'..'z' && !s[right].isDigit()) {
            right--
        } else if (s[left] == s[right]) {
            left++
            right--
        } else {
            return false
        }
    }
    return true
}
