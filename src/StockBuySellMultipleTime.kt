fun main() {
    val stocks = intArrayOf(6,5,3,7,1,4)
    println("Stock buy Sell Multiple time: ${stockBuySellMultiple(stocks)}")
}

fun stockBuySellMultiple(stocks: IntArray): Int {
    var profit = 0
    for (n in 1 until stocks.size) {
        if (stocks[n] > stocks[n - 1]) {
            profit += stocks[n] - stocks[n - 1]
        }
    }
    return profit
}