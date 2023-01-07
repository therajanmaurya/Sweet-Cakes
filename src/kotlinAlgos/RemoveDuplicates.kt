package kotlinAlgos

fun main() {
    println(removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)))
}

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    if (nums.size == 1) return 1

    var prev = 0

    for (n in 1 until nums.size) {
        if(nums[prev] != nums[n]) {
            nums[++prev] = nums[n]
        }
    }
    return prev + 1
}