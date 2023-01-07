fun main() {

    val trappedWater = intArrayOf(7, 0, 4, 2, 5, 0, 6, 4, 0, 5)
    println("Trapped Water: ${trappingRainWater(trappedWater)}")
}

fun trappingRainWater(trappedWater: IntArray): Int {

    val n = trappedWater.size
    val left = IntArray(n)
    val right = IntArray(n)

    left[0] = trappedWater[0]
    for (i in 1 until n) {
        left[i] = Math.max(left[i - 1], trappedWater[i])
    }

    right[n - 1] = trappedWater[n - 1]
    for (j in n - 2 downTo 0) {
        right[j] = Math.max(right[j + 1], trappedWater[j])
    }

    var sum = 0

    for (x in 0 until n) {
        sum += Math.min(left[x], right[x]) - trappedWater[x]
    }
    return sum
}