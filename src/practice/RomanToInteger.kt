package practice

fun main() {
    println("Roman To Integer: ${romanToInteger("MCMXCIV")}")
    println("Roman To Integer: ${romanToInt("VII")}")
}

fun romanToInteger(roman: String): Int {
    val map = mutableMapOf(
        Pair("I", 1),
        Pair("V", 5),
        Pair("X", 10),
        Pair("L", 50),
        Pair("C", 100),
        Pair("D", 500),
        Pair("M", 1000),
        Pair("IV", 4),
        Pair("IX", 9),
        Pair("XL", 40),
        Pair("XC", 90),
        Pair("CD", 400),
        Pair("CM", 900)
    )

    var sum = 0
    var start = 0
    while (start < roman.length) {
        if (start < roman.length - 1 && map.containsKey(roman.substring(start, start + 2))) {
            sum += map.getValue(roman.substring(start, start + 2))
            start += 2
        } else {
            sum += map.getValue(roman[start].toString())
            start += 1
        }
    }

    return sum
}

fun romanToInt(s: String): Int {

    var result = 0
    var last = 'z'

    for (n in s.toCharArray().size - 1 downTo 0) {
        when (s[n]) {
            'I' -> {
                if (last == 'X' || last == 'V') {
                    result -= 1
                } else {
                    result += 1
                }
            }
            'V' -> {
                result += 5
            }
            'X' -> {
                if (last == 'L' || last == 'C') {
                    result -= 10
                } else {
                    result += 10
                }
            }
            'L' -> {
                result += 50
            }
            'C' -> {
                if (last == 'D' || last == 'M') {
                    result -= 100
                } else {
                    result += 100
                }
            }
            'D' -> {
                result += 500
            }
            'M' -> {
                result += 1000
            }
        }
        last = s[n]
    }

    return result
}