public class RemoveElement {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int currentIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = -1;
            }
        }

        for (int n : nums) {
            if (n != -1) {
                nums[currentIndex] = n;
                currentIndex++;
            }
        }

        return currentIndex;
    }
}
