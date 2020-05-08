
// n^2
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {67, 34, 55, 23, 45, 12};
        for (int s : selectionShort(arr)) {
            System.out.print(s + " ");
        }
    }

    private static int [] selectionShort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; ++i) {
            int min_index = i;
            for (int j = i + 1; j < n; ++j) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
