
fun main(args: Array<String>) {
    val test = 3
    printFun(test)
}

fun printFun(test: Int) {
    if (test < 1) return else {
        System.out.printf("%d ", test)
        printFun(test - 1) // statement 2
        System.out.printf("%d ", test)
        return
    }
}