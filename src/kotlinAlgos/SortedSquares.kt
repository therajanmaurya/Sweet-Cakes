package kotlinAlgos

fun main() {
    println("Sorted Squares: ${sortedSquares(intArrayOf(-4, -1, 0, 3, 10)).toList()}")
}

fun sortedSquares(nums: IntArray): IntArray {
    val result = IntArray(nums.size)
    var n = nums.size
    var l = 0
    var r = n - 1
    for(a in n-1 downTo  0) {
        if(Math.abs(nums[l]) > Math.abs(nums[r])) {
            result[a] = nums[l]*nums[l]
            ++l
        } else {
            result[a] = nums[r]*nums[r]
            --r
        }
    }
    return result
}