fun main() {
    print(generatePascal(5))
}

fun generatePascal(numRows: Int): List<List<Int>> {
    val triangle: MutableList<MutableList<Int>> = arrayListOf()

    if (numRows == 0) return triangle

    val firstRow: MutableList<Int> = arrayListOf()
    firstRow.add(1)
    triangle.add(firstRow)

    for (i in 1 until numRows) {
        val prevRow: MutableList<Int> = triangle[i-1]
        val currentRow: MutableList<Int> = arrayListOf()
        currentRow.add(1)

        for (j in 1 until i) {
            currentRow.add(prevRow[j-1] + prevRow[j])
        }
        currentRow.add(1)
        triangle.add(currentRow)
    }

    return triangle
}