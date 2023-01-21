package kotlinAlgos

fun main() {
    println("Capacity Of Ship: ${shipWithinDays(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5)}")
}

fun shipWithinDays(weights: IntArray, days: Int): Int {
    var left = weights.max()!!
    var right = weights.sum()

    while (left < right) {
        val mid = left + (right - left) / 2
        if (isValid(weights, mid) <= days) {
            right = mid
        } else {
            left = mid + 1
        }
    }
    return left
}

// [1,2,3,4,5,6,7,8,9,10]
fun isValid(weights: IntArray, target: Int): Int {
    var total = 0
    var count = 1
    for (n in weights) {
        total += n
        if (total > target) {
            ++count
            total = n
        }
    }
    return count
}