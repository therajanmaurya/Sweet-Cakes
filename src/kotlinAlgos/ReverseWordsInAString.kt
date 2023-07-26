package kotlinAlgos

fun main() {
    println(reverseWords("  asdasd df f"))
}

fun reverseWords(s: String): String {
    if (s.isEmpty()) return ""

    var lastIndex = -1
    val result = StringBuilder()

    for (i in s.length -1 downTo 0) {

        if (s[i] != ' ' && lastIndex == -1) {
            lastIndex = i
        }

        if (lastIndex != -1 && i == 0) {
            if (result.isEmpty()) {
                result.append(s.substring(0, lastIndex + 1))
            } else {
                result.append(" ${s.substring(0, lastIndex + 1)}")
            }
            println(result.toString())
            return result.toString()
        }

        if (lastIndex != -1 && s[i] == ' ') {
            if (result.isEmpty()) {
                result.append(s.substring(i+1, lastIndex + 1))
            } else {
                result.append(" ${s.substring(i+1, lastIndex + 1)}")
            }
            println(result.toString())
            lastIndex = -1
        }
    }

    return result.toString()
}