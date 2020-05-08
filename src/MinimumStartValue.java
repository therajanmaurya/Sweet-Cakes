public class MinimumStartValue {

    public static void main(String[] args) {
        System.out.println(minStartValue(new int[]{1, 2}));
    }

    public static int minStartValue(int[] nums) {
        int min = 0;
        if (nums[0] > 0) {
            min = 1;
        } else {
            min = nums[0] * -1 + 1;
        }
        int last_sum = min;
        while (true) {
            for (int i = 0; i < nums.length; i++) {
                last_sum = last_sum + nums[i];
                if (last_sum < 1) {
                    min += 1;
                    last_sum = min;
                    break;
                } else if (i == nums.length - 1) {
                    return min;
                }
            }
        }
    }
}
