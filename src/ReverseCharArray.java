import java.util.Arrays;

public class ReverseCharArray {

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        System.out.print(Arrays.toString(reverseCharArray(arr)));
    }

    private static char[] reverseCharArray(char[] aar) {
        int leftIndex = 0;
        int rightIndex = aar.length - 1;
        while (leftIndex < rightIndex) {
            char temp = aar[leftIndex];
            aar[leftIndex] = aar[rightIndex];
            aar[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        return aar;
    }
}
