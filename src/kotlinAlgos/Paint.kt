package kotlinAlgos

import kotlin.math.min

fun main() {
    println(
       "Total Paint Time: ${
           paint(
               mutableListOf(
                   mutableListOf(2, 9, 4),
                   mutableListOf(20, 7, 15),
                   mutableListOf(18, 12, 19)
               )
           )
       }"
    )

}

fun paint(times: MutableList<MutableList<Int>>): Int {
    var lastPaintIndex: Int? = null
    var paintTime = 0

    times.forEach {
        var minTime = 0
        var localIndex: Int? = null
        it.forEachIndexed { index, i ->
            if (lastPaintIndex != index) {
                if (minTime == 0) {
                    minTime = i
                    localIndex = index
                } else if (i < minTime) {
                    minTime = i
                    localIndex = index
                }
            }
        }
        lastPaintIndex = localIndex
        paintTime += minTime
    }
    return paintTime
}