import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {10, 5, 66, 35, 2, 4, 9, 11, 25, 29, 44, 35};
        for (int n : mergeSort(arr)) {
            System.out.println(n);
        }
    }

    private static int[] mergeSort(int[] arrayToSort) {

        // BASE CASE: arrays with fewer than 2 elements are sorted
        if (arrayToSort.length < 2) {
            return arrayToSort;
        }

        // STEP 1: divide the array in half
        // we use integer division, so we'll never get a "half index"
        int midIndex = arrayToSort.length / 2;

        int[] left = Arrays.copyOfRange(arrayToSort, 0, midIndex);
        int[] right = Arrays.copyOfRange(arrayToSort, midIndex, arrayToSort.length);

        // STEP 2: sort each half
        int[] sortedLeft = mergeSort(left);
        int[] sortedRight = mergeSort(right);

        // STEP 3: merge the sorted halves
        int[] sortedArray = new int[arrayToSort.length];

        int currentLeftIndex = 0;
        int currentRightIndex = 0;

        for (int currentSortedIndex = 0; currentSortedIndex < arrayToSort.length;
             currentSortedIndex++) {

            // sortedLeft's first element comes next
            // if it's less than sortedRight's first
            // element or if sortedRight is exhausted
            if (currentLeftIndex < sortedLeft.length
                    && (currentRightIndex >= sortedRight.length
                    || sortedLeft[currentLeftIndex] < sortedRight[currentRightIndex])) {
                sortedArray[currentSortedIndex] = sortedLeft[currentLeftIndex];
                currentLeftIndex++;
            } else {
                sortedArray[currentSortedIndex] = sortedRight[currentRightIndex];
                currentRightIndex++;
            }
        }

        return sortedArray;
    }
}
