import java.util.HashSet;

public class FindDuplicate {

    public static void main(String[] args) {
        //findDuplicate(new int[]{1, 3, 4, 2, 2});
        //System.out.println(usingSlowFastPointer(new int[] { 1, 3, 4, 2, 2 }));
        System.out.println(usingHashSet(new int[] { 1, 3, 4, 2, 2 }));
    }

    public static int usingHashSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            } else {
                set.add(num);
            }
        }
        return -1;
    }

    public static int findDuplicate(int[] nums) {
        for (int i =   0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            if (nums[num] < 0) {
                System.out.println(num);
                return Math.abs(num);
            } else {
                nums[num] *= -1;
            }
        }
        return 0;
    }

    public static int usingSlowFastPointer(int[] nums) {

        int slow_pointer = nums[0];
        int fast_pointer = nums[0];

        slow_pointer = nums[slow_pointer];
        fast_pointer = nums[nums[fast_pointer]];

        while (slow_pointer != fast_pointer) {
            slow_pointer = nums[slow_pointer];
            fast_pointer = nums[nums[fast_pointer]];
        }

        int a_pointer = nums[0];
        int b_pointer = slow_pointer;

        while (a_pointer != b_pointer) {
            a_pointer = nums[a_pointer];
            b_pointer = nums[b_pointer];
        }

        return a_pointer;
    }
}
