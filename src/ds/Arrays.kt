fun main() {

    val array = IntArray(10)

    // arrayOf Library Method
    val strings = arrayOf(1, 2, 3, 4, 5)

    // Primitive Arrays
    val integers = intArrayOf(1, 2, 3, 4, 5)

    // Late Initialization With Indices
    val lateArray = arrayOfNulls<Number>(5)

    // Generating Values With an Initializer
    val generatedArray = IntArray(10) { i -> i * i }
    val generatedStringArray = Array(10) { i -> "Number of index: $i" }

    multiDimensionalArray()


}

fun multiDimensionalArray() {
    val array3x3 = arrayOf(intArrayOf(3, 2, 3), intArrayOf(1, 2, 3), intArrayOf(5, 6, 7, 8))
    val sum = Array(3) { IntArray(2) }
    for (row in array3x3) {
        for (colum in row) {
            print("$colum ")
        }
        println()
    }

    val rows = 2
    val columns = 3
    val firstMatrix = arrayOf(
        intArrayOf(2, 3, 4),
        intArrayOf(5, 2, 3)
    )
    val secondMatrix = arrayOf(intArrayOf(-4, 5, 3), intArrayOf(5, 6, 3))
    val sum1 = Array(rows) { IntArray(columns) }
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            sum1[i][j] = firstMatrix[i][j] + secondMatrix[i][j]
            print("${sum1[i][j]} ")
        }
        println()
    }

    val data = arrayOf(
        arrayOf(intArrayOf(0, 0), intArrayOf(5)),
        arrayOf(intArrayOf(0, 1), intArrayOf(5)),
        arrayOf(intArrayOf(1, 0), intArrayOf(5)),
        arrayOf(intArrayOf(1, 1), intArrayOf(5))
    )

    println()
    println()

    for (i in data) {
        for (j in i) {
            for (k in j) {
                print("$k ")
            }
        }
        println()
    }
}
