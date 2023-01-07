fun main() {

    val a = intArrayOf(-5, 4, 6, -3, 4, -1)
    println("Maximum SubArray: ${findMaximumSubArrayBruteForce(a)}")
    println("Maximum SubArray Kadane: ${findMaximumSubArrayKadane(a)}")
    println("Maximum SubArray Dynamic Programming: ${findMaximumSubArrayDynamicProgramming(a)}")
    println("Maximum SubArray Kadane Start End: ${findMaximumSubArrayKadanePrintStartEnd(a)}")
}

// O(n^2)
fun findMaximumSubArrayBruteForce(array: IntArray): Int {
    var maxSum = Int.MIN_VALUE
    for (i in array.indices) {
        var sum = 0
        for (j in i until array.size) {
            sum += array[j]
        }
        if (sum > maxSum) maxSum = sum
    }
    return maxSum
}

fun findMaximumSubArrayKadane(array: IntArray): Int {
    var maxSum = Int.MIN_VALUE
    var currSum = 0
    for (i in array) {
        currSum += i
        if (currSum > maxSum) maxSum = currSum
        if (currSum < 0) currSum = 0
    }
    return maxSum
}

fun findMaximumSubArrayDynamicProgramming(array: IntArray): Int {
    var maxSum = array[0]
    var currSum = array[0]
    for (i in 1 until array.size) {
        currSum = Math.max(array[i], currSum + array[i])
        maxSum = Math.max(maxSum, currSum)
    }
    return maxSum
}

fun findMaximumSubArrayKadanePrintStartEnd(array: IntArray): Int {
    var maxSum = Int.MIN_VALUE
    var currSum = 0
    var s = 0
    var start = 0
    var end = 0
    for (i in array.indices) {
        currSum += array[i]
        if (currSum > maxSum) {
            maxSum = currSum
            start = s
            end = i
        }
        if (currSum < 0) {
            currSum = 0
            s = i + 1
        }
    }
    println("Starting: $start")
    println("Ending: $end")
    return maxSum
}

