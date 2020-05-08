public class SumOfContiguousSubArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, -2, 5};
        int[] arr1 = new int[]{-1, -2, -3, -4};
        System.out.println(sumOfContiguousSubArray(arr1));
    }

    public static int sumOfContiguousSubArray(int[] arr) {
        int sum = arr[0];
        int currentSum = sum;
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(currentSum + arr[i], arr[i]);
            sum = Math.max(sum, currentSum);
        }
        return sum;
    }
}
