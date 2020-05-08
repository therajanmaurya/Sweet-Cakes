
import java.util.stream.Stream
import javax.swing.UIManager.put
import java.util.HashMap
import java.util.Map
import kotlin.math.ceil
import kotlin.reflect.typeOf


class Payever {

    //"Codility We test coders"

    internal object Main {
        @JvmStatic
        fun main(args: Array<String>) {

            val testCase = "00:01:07,400-234-090\n00:05:01,701-080-080\n00:05:00,400-234-090"

            println(solution(testCase))
        }

        fun solution(S: String): Int {
            val records = S.split("\n".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val map = HashMap<String, Int>()

            for (record in records) {
                val durationString = record.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[0]
                val phoneNumber = record.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[1]

                var duration = 0
                duration = Integer.parseInt(durationString.split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[2])
                duration += 60 * Integer.parseInt(durationString.split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[1])
                duration += 3600 * Integer.parseInt(durationString.split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[0])

                if (map.containsKey(phoneNumber)) {
                    duration += map[phoneNumber]!!
                }

                map[phoneNumber] = duration
            }

            var totalCost = 0
            val sortedRecords = map.entries.stream().sorted(Map.Entry.comparingByValue()).sorted(Map.Entry.comparingByKey<String, Int>()).toArray().drop(1)

            for (record in sortedRecords) {
                val duration = Integer.parseInt(record.toString().split("=")[1])
                if (duration < 300) {
                    totalCost += duration * 3
                } else {
                    totalCost += (ceil((duration.toDouble()) / 60)).toInt() * 150
                }
            }

            return totalCost
        }
    }

}