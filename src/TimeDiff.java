import java.util.*;
import java.io.*;

class Main {

    public static String TimeDifference(String[] strArr) {
        // code goes here
        boolean[] allTime = new boolean[12 * 2 * 60];

        for (String str : strArr) {
            String[] hm = str.split(":");

            int timeFormat = 0;
            if (str.contains("am")) timeFormat = 0;
            else timeFormat = 12;

            int h = Integer.parseInt(hm[0]) + timeFormat(str);
            int m = Integer.parseInt(hm[1].replace("am", "").replace("pm", ""));

            if (str.contains("am")) h %= 12;
            int minute = (h * 60) + m;
            if (allTime[minute]) return "0";

            allTime[minute] = true;
        }

        Integer first = null;
        Integer pre = null;
        Integer min = Integer.MAX_VALUE;

        for (int i = 0; i < 1440; i++) {
            if (allTime[i]) {
                if (first == null) {
                    first = i;
                    pre = i;
                } else {
                    min = Math.min(min, Math.min(i - pre, 1440 - i + pre));
                    pre = i;
                }
            }
        }

        min = Math.min(min, Math.min(pre - first, 1440 - pre + first));
        return String.valueOf(min);
    }

    public static int timeFormat(String time) {
        if (time.contains("am")) {
            return 0;
        } else {
            return 12;
        }
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(TimeDifference(new String[]{"10:00am", "11:45pm", "5:00am", "12:01am"}));
    }

}