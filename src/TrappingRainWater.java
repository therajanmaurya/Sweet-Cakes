public class TrappingRainWater {

    static int arr[] = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

    public static void main(String[] args) {
        System.out.println("Maximum water that can be accumulated is " + findWater1(arr));
    }

    // Method for maximum amount of water
    static int findWater(int n) {
        // left[i] contains height of tallest bar to the
        // left of i'th bar including itself
        int left[] = new int[n];

        // Right [i] contains height of tallest bar to
        // the right of ith bar including itself
        int right[] = new int[n];

        // Initialize result
        int water = 0;

        // Fill left array
        left[0] = arr[0];
        for (int i = 1; i < n; i++)
            left[i] = Math.max(left[i - 1], arr[i]);

        // Fill right array
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], arr[i]);

        // Calculate the accumulated water element by element
        // consider the amount of water on i'th bar, the
        // amount of water accumulated on this particular
        // bar will be equal to min(left[i], right[i]) - arr[i] .
        for (int i = 0; i < n; i++)
            water += Math.min(left[i], right[i]) - arr[i];

        return water;
    }

    private static int findWater1(int[] arr) {
        int sum = 0;

        int h = Integer.MIN_VALUE;

        for (int a : arr) {
            h = Math.max(h, a);
        }

        int ch = arr[0];

        for (int b : arr) {
            if (b == h) {
                break;
            } else if (b < ch) {
                sum += (ch - b);
            } else if (b >= ch) {
                ch = b;
            }
        }

        int ch1 = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == h) {
                break;
            } else if (arr[i] < ch1) {
                sum += (ch1 - arr[i]);
            } else if (arr[i] >= ch1) {
                ch1 = arr[i];
            }
        }

        return sum;
    }
}
