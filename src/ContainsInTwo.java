import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsInTwo {

    public static void main(String[] args) {

    }

    public static void contains() {

        int[] A = {2, 5, 3, 2, 8, 1};
        int[] B = {7, 9, 5, 2, 4, 10, 10};
        int[] C = {6, 7, 5, 5, 3, 7};

        Set<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> mapA = new HashMap<>();
        HashMap<Integer, Integer> mapB = new HashMap<>();
        HashMap<Integer, Integer> mapC = new HashMap<>();

        int maxSize = Math.max(A.length, Math.max(B.length, C.length));
        for (int i = 0; i < maxSize - 1; i++) {

            if (i < A.length) {
                mapA.put(i, A[i]);
            }

            if (i < B.length) {
                mapB.put(i, B[i]);
            }

            if (i < C.length) {
                mapC.put(i, C[i]);
            }
        }


    }

}
