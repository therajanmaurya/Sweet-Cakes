package practice

fun main() {
    println("${removeDuplicates(intArrayOf(1, 1, 2))}")
}

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    if (nums.size == 1) return 1
    var prev = 0
    for (n in 1 until nums.size) {
        if (nums[prev] != nums[n]) {
            nums[++prev] = nums[n]
        }
    }
    return prev + 1
}
