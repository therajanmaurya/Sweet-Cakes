import java.util.HashMap;

public class FindMinimumPair {

    public static void main(String[] args) {
        int[] a = {10, 2, 34, 5, 2, 34, -1};
        int[] b = {34, 1, 4, 6, 3, 6, 7, 2, -1};
        System.out.println(finaMinimumPairValue(a, b));
    }

    private static int finaMinimumPairValue(int[] a, int[] b) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int minimumPair = 0;
        for (int arrA : a) {
            if (!map.containsKey(arrA)) {
                map.put(arrA, 1);
            }
        }

        for (int arrB : b) {
            if (map.containsKey(arrB)) {
                if (minimumPair == 0) {
                    minimumPair = arrB;
                } else  {
                    minimumPair = Math.min(arrB, minimumPair);
                }
            }
        }

        return minimumPair;
    }
}
