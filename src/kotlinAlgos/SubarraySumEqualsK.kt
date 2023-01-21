package kotlinAlgos

fun main() {
    println("Sum Array: ${subarraySum(intArrayOf(1,2,3, 3), 3)}")
}

fun subarraySum(nums: IntArray, k: Int): Int {
    var counter = 0
    var sum = 0
    val map = mutableMapOf<Int, Int>()

    map[0] = 1

    for(num in nums) {
        sum += num
        counter += map[sum -k] ?: 0
        map[sum] = (map[sum] ?: 0) + 1
    }

    return counter
}