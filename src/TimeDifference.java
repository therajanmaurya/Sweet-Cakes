import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TimeDifference {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>() {{
            add("23:59");
            add("00:00");
        }};
        long startTime = System.nanoTime();
        findMinDifference(list);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
        //long currentTime = System.currentTimeMillis();

    //    System.out.println(System.currentTimeMillis() - currentTime);

    }




    public static int findMinDifference(List<String> timePoints) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (String s : timePoints) {
            int h = Integer.valueOf(s.substring(0,2));
            int m = Integer.valueOf(s.substring(3));
            pq.offer(h*60+m);
        }
        if (pq.size() < 2) return 0;
        int res = Integer.MAX_VALUE, first = pq.poll();
        int cur = first;
        while (!pq.isEmpty()) {
            int next = pq.poll();
            res = Math.min(res, next-cur);
            cur = next;
        }
        return Math.min(res, 24*60-cur+first);
    }
}
