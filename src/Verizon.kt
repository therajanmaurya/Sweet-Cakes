import java.time.Month
import java.util.*


internal object Verizon {

    fun solution1(A: IntArray): Int {
        var total = 0
        A.forEach {
            if (it in 10..99 || it in -99..-10) {
                total += it
            }
        }
        return total
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(solution1(intArrayOf(22, 99, -99, 9, 4332, 4433)))
        //solution(2015, "February", "May", "Monday")
    }

    fun solution(Y: Int, A: String, B: String, W: String): Int {
        // write your code in Kotlin
        return getDifferenceDays(getFirstMonday(Y, Month.valueOf(A.toUpperCase()).value - 1), getLastSunday(Y, Month.valueOf(B.toUpperCase()).value - 1)) / 7
    }

    fun getFirstMonday(year: Int, month: Int): Date {
        return Calendar.getInstance().apply {
            this.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY)
            this.set(Calendar.DAY_OF_WEEK_IN_MONTH, 1)
            this.set(Calendar.MONTH, month)
            this.set(Calendar.YEAR, year)
        }.time
    }

    fun getLastSunday(year: Int, month: Int): Date {
        return Calendar.getInstance().apply {
            this.set(year, month + 1, 1)
            this.add(Calendar.DATE, -1)
            this.add(Calendar.DAY_OF_MONTH, -(this.get(Calendar.DAY_OF_WEEK) - 1))
        }.time
    }


    fun getDifferenceDays(d1: Date, d2: Date): Int {
        val diff = d2.time - d1.time
        val diffDays = diff / (24 * 60 * 60 * 1000) + 1
        return diffDays.toInt()
    }
}