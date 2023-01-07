fun main() {

    val a = intArrayOf(5, 1, 4, 1, 1)
    val b = intArrayOf(1, 2, 1, 1, 5, 1)
    println("Majority Element Brute Force: ${majorityOfElementsBruteForce(a)}")
    println("Majority Element using Map: ${majorityOfElementsUsingMap(a)}")
    println("Majority Element using credibility: ${majorityOfElementsCredibilityInOn(b)}")
    println("Majority Element Sorting: ${majorityOfElementsSorting(a)}")
}

// {5,1,4,1,1} O(n^2)
fun majorityOfElementsBruteForce(a: IntArray): Int {
    var me = a[0]
    var mec = 0

    for (i in a) {
        var currMec = 0
        for (j in a) {
            if (i == j) ++currMec
        }
        if (mec < currMec) {
            mec = currMec
            me = i
        }
    }

    return if (mec > a.size / 2) me else -1
}

// {5,1,4,1,1} O(NLogN)
fun majorityOfElementsSorting(a: IntArray): Int {
    a.sort()
    var mc = 0
    var mcValue = a[0]
    var currValue = a[0]
    var currCount = 0
    for (i in a) {
        if (i == currValue) {
            ++currCount
        } else {
            if (currCount > mc) {
                mc = currCount
                mcValue = currValue
            }
            currValue = i
            currCount = 1
        }
    }

    if (currCount > mc) {
        mc = currCount
        mcValue = currValue
    }

    return if (mc > a.size / 2) mcValue else -1
}

// {5,1,4,1,1} O(N)
fun majorityOfElementsUsingMap(a: IntArray): Int {
    val mMap = hashMapOf<Int, Int>()
    var mcValue = a[0]
    var meCount = 0
    for (i in a) {
        if (mMap.containsKey(i)) {
            mMap[i] = mMap.getOrDefault(i, 0).plus(1)
        } else {
            mMap[i] = 1
        }
    }

    for (j in mMap.entries) {
        if (j.value > meCount) {
            meCount = j.value
            mcValue = j.key
        }
    }

    return if (meCount > a.size / 2) mcValue else -1
}

// {5,1,4,1,1} O(N)
fun majorityOfElementsCredibilityInOn(a: IntArray): Int {

    var ansIndex = 0
    var count = 1

    var index = 1
    while (index < a.size) {
        if (a[ansIndex] == a[index]) {
            ++count
        } else {
            --count
        }
        if (count == 0) {
            ansIndex = index
            count = 1
        }
        ++index
    }

    count = 0
    for (j in a) {
        if (a[ansIndex] == j) {
            ++count
        }
    }

    return if (count > a.size / 2) a[ansIndex] else -1
}