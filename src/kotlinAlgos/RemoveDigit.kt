package kotlinAlgos

fun main() {
    println("Largest Number ${removeDigit("2998589353917872714814599237991174513476623756395992135212546127959342974628712329595771672911914471", '3')}")
}

fun removeDigit(number: String, digit: Char): String {
    var index = 0
    for(n in number.indices) {
        if(number[n] == digit) {
            index = n
            if(n < number.length - 1 && digit < number[n+1]) break
        }
    }
    return number.substring(0, index) + number.substring(index+1)
}