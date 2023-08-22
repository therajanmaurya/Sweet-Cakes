package practice

fun main() {
    println("${twoSum(intArrayOf(2, 7, 11, 15), 9)}")
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    if (nums.size == 2 && (target == nums[0] + nums[1])) {
        return intArrayOf(0, 1)
    }

    val map = mutableMapOf<Int, Int>()
    nums.forEachIndexed { index, value ->
        val a = target - value
        if (map.containsKey(a)) {
            return intArrayOf(map.getValue(a), index)
        }
        map[value] = index
    }
    return intArrayOf(-1, -1)
}