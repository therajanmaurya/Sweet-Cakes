fun main() {
    val stocks = intArrayOf(3, 1, 4, 8, 7, 2, 5)
    println("Buy Sell Stocks MaxProfit Brute Force: ${stockBuySellBruteForce(stocks)}")
    println("Buy Sell Stocks MaxProfit Auxiliary Array: ${stockBuySellUsingAuxiliaryArray(stocks)}")
    println("Buy Sell Stocks MaxProfit Minimum So Far: ${stockBuySellUsingMinimumSoFar(stocks)}")
}

// T = O(n^2)
fun stockBuySellBruteForce(stocks: IntArray): Int {
    var maxProfit = 0
    for (i in stocks) {
        for (j in stocks) {
            if (maxProfit < i - j) {
                maxProfit = i - j
            }
        }
    }
    return maxProfit
}

// T = O(n^2) S = O(n)
fun stockBuySellUsingAuxiliaryArray(stocks: IntArray): Int {
    var maxProfit = 0
    var aux = IntArray(stocks.size)
    aux[stocks.size - 1] = stocks[stocks.size - 1]
    for (i in stocks.size - 2 downTo 0) {
        aux[i] = Math.max(stocks[i], aux[i + 1])
    }
    for (j in stocks.indices) {
        maxProfit = Math.max(maxProfit, aux[j] - stocks[j])
    }
    return maxProfit
}

// T = O(n) S = O(1)
fun stockBuySellUsingMinimumSoFar(stocks: IntArray): Int {
    var maxProfit = 0
    var minimumSoFar = stocks[0]
    for (n in stocks) {
        minimumSoFar = Math.min(n, minimumSoFar)
        maxProfit = Math.max(maxProfit, n - minimumSoFar)
    }
    return maxProfit
}