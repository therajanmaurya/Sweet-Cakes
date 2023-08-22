package practice

fun main() {
    println("${firstOccurrenceInString("mississippi", "issip")}")
}

fun firstOccurrenceInString(haystack: String, needle: String): Int {
    var (r, l) = 0 to 0
    var i = 0

    while (r < haystack.length) {
        if (haystack[r++] == needle[i++]) {
            if (i == needle.length) return l
        } else {
            r = ++l
            i = 0
        }
    }

    return -1
}