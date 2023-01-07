package kotlinAlgos

fun main() {
    println("Peak Element position: ${findPeakElement(intArrayOf(1, 3, 20, 4, 1, 0))}")
}

// O(n)
fun findPeakBruteForce(nums: IntArray): Int {


    return 0
}

// O(log n)
fun findPeakElement(nums: IntArray): Int {
    var left = 0
    var right = nums.size - 1

    while (left < right) {
        val mid = left + (right - left) / 2

        if (nums[mid] > nums[mid + 1]) {
            right = mid
        } else {
            left = mid + 1
        }
    }

    return left
}