package practice

fun main() {
    println(longestCommonPrefix(arrayOf("flower", "flower", "flower")))
}

fun longestCommonPrefix(strs: Array<String>): String {
    val prefix = StringBuilder()
    var counter = 1
    strs[0].forEachIndexed { index, value ->
        for (n in 1 until strs.size) {
            if (strs[n].length -1 < index) {
                return prefix.toString()
            }
            if (strs[n][index] == value) {
                ++counter
            } else {
                return prefix.toString()
            }
        }
        if (counter == strs.size) {
            prefix.append(value)
            counter = 1
        }
    }
    return prefix.toString()
}
