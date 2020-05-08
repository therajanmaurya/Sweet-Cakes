public class SubOfSubSequence {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int arr1[] = {1, 2, 4, 5};
        int n = arr.length;
        // System.out.println(findMinSum(arr, n));
        System.out.println(findMinSumOfSubSeq(arr));
    }

    static int findMinSum(int arr[], int n) {
        int occ = n - 1, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i] * (int) Math.pow(2, occ);
            occ--;
        }
        return sum;
    }

    private static int findMinSumOfSubSeq(int[] arr) {
        int sum = 0;
        int occur = arr.length - 1;
        for (int a : arr) {
            sum += a * (int) Math.pow(2, occur);
            occur--;
        }
        return sum;
    }
}
