public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {4, 5, 5, 6, 9, 10, 34, 34, 43, 65};
        //System.out.print(binarySearch(arr, 43));
        System.out.print(binarySearch1(arr, 6));
    }

    private static boolean binarySearch(int[] arr, int target) {
        int floorIndex = -1;
        int ceilingIndex = arr.length;

        while (floorIndex + 1 < ceilingIndex) {

            int distance = ceilingIndex - floorIndex;
            int halfIndex = distance / 2;
            int guessIndex = floorIndex + halfIndex;
            int guessValue = arr[guessIndex];

            if (guessValue == target) {
                return true;
            }

            if (target < guessValue) {
                ceilingIndex = guessIndex;
            } else {
                floorIndex = guessIndex;
            }
        }

        return false;
    }

    private static int binarySearch1(int[] arr, int target) {
        if (arr.length == 0) return -1;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
