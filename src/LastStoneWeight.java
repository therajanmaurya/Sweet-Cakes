import java.util.Arrays;
import java.util.List;

public class LastStoneWeight {

    public static void main(String[] args) {

        int[] dd = new int[]{2, 7, 4, 1, 8, 1};

        System.out.println(lastStoneWeight(dd));
    }

    public static int lastStoneWeight(int[] stones) {

        int index = stones.length;

        Arrays.sort(stones);

        for (int i = stones.length - 1; i >= 0; i--) {
            Arrays.sort(stones);
            if (stones[i] == stones[i - 1]) {
                stones[i] = 0;
                stones[i - 1] = 0;
                index--;
                index--;
            } else {
                int diff = Math.abs(stones[i] - stones[i - 1]);
                stones[i] = 0;
                stones[i - 1] = diff;
                index = index - 1;
            }
        }

        return index;
    }
}
