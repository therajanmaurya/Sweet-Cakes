
//n^2
public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        for (int a : bubbleSort(arr)) {
            System.out.print(a + " ");
        }
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
