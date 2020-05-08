import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountingElements {

    public static void main(String[] args) {
        System.out.println(countingElement(new int[]{1, 1, 3, 3, 5, 5, 7, 7}));
        //System.out.println(countingElementNormal(new int[]{1, 1, 2}));

    }

    public static int countingElement(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int a : arr) {
            set.add(a);
        }

        for (int i : arr) {
            if (set.contains(i + 1)) {
                count += 1;
            }
        }

        return count;
    }

    public static int countingElementNormal(int[] arr) {
        int count = 0;
        Arrays.sort(arr);

        int duplicate = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                duplicate += 1;
            } else if (arr[i + 1] == (arr[i] + 1)) {
                count += 1;

                while (duplicate > 0 && (i + 1) < arr.length - 1) {
                    ++i;
                    if (arr[i] == arr[i + 1]) {
                        duplicate -= 1;
                        count += 1;
                    } else {
                        --i;
                        break;
                    }
                }
            }
        }

        return count;
    }
}
