package kotlinAlgos

fun main() {
    println("Linear Binary Search: ${linearSearch(intArrayOf(1, 2, 3, 4, 5, 5), 5)}")
    println("Iterative Approach: ${usingIntegrative(intArrayOf(1, 2, 3, 4, 5, 6, 8, 10, 12, 14), 9)}")
}

fun linearSearch(array: IntArray, n: Int): Int {
    array.forEachIndexed { index, value ->
        if (value == n) return index
    }
    return -1
}

fun usingIntegrative(array: IntArray, n: Int): Int {
    var left = 0
    var right = array.size - 1
    while (left <= right) {
        val mid = left + (right - left) / 2
        if (array[mid] == n) return mid
        else if (array[mid] > n) {
            right = mid - 1
        } else {
            left = mid + 1
        }
    }
    return left
}