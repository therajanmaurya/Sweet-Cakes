import kotlin.math.abs

fun main() {
    println("Count: ${findLeastNumOfUniqueInts(arrayOf(2, 4, 1, 8, 3, 5, 1, 3).toIntArray(), 3)}")
}

fun findLeastNumOfUniqueInts(arr: IntArray, k: Int): Int {
    var kR = k
    val h = HashMap<Int, Int>()
    for (n in 0..arr.size - 1) {
        if (h.contains(arr[n])) {
            h.put(arr[n], h.getOrDefault(arr[n], 1).plus(1))
        } else {
            h.put(arr[n], 1)
        }
    }

    var count = IntArray(arr.size + 1)
    for (i in 0..count.size - 1) {
        count[i] = 0
    }

    for (n in h.values) {
        ++count[n]
    }

    count.forEachIndexed { index, value ->
        count[index] = value * index
    }

    for (index in count.indices) {
        if (kR > count[index]) {
            kR -= count[index]
            count[index] = 0
        } else {
            count[index] = count[index] - kR
            break
        }
    }

    var nValue = 0
    for (a in count) {
        if (a > 0) {
            ++nValue
        }
    }
    return nValue
}