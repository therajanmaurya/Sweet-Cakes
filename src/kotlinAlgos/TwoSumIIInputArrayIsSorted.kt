package kotlinAlgos

fun main() {
    twoSumIIInputArrayIsSorted(intArrayOf(2, 7, 11, 15), 9).forEach {
        println(it)
    }
}

fun twoSumIIInputArrayIsSorted(numbers: IntArray, target: Int): IntArray {

    var left = 0
    var right = numbers.size - 1

    val result = IntArray(2)

    while (left < right) {

        val curr = numbers[left] + numbers[right]

        if (target < curr) {
            --right
        }
        if (target > curr) {
            ++left
        }
        if (target == curr) {
            result[0] = left + 1
            result[1] = right + 1
            break
        }
    }
    return result
}