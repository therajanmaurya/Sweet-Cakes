import java.util.HashSet;
import java.util.Stack;
import java.util.stream.Collector;

public class HappyNumber {

    public static void main(String[] args) {
        isHappy(19);
        int count = (int) "Hello".chars().distinct().count();

        int max = 0;
        int[] arr = new int[] {4,2,3,1};

//        for(int i = 0 ; i < arr.length - 1; i++) {
//            int k = i+1;
//            for(int j = k; j < arr.length; j++) {
//                if(Math.abs(arr[i] - arr[j]) >= 2) {
//                  //  System.out.println(Math.abs(arr[i] - arr[j]) );
//                    if(j-i==1) max++;
//                }
//            }
//        }

        for(int i = 0 ; i < arr.length - 1; i++) {

                if(Math.abs(arr[i] - arr[i+1]) >= 2) {
                    //  System.out.println(Math.abs(arr[i] - arr[j]) );
                    max++;
                }
        }

        System.out.println(max);
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> allNums = new HashSet<>();
        allNums.add(n);

        while(n != 1) {
            String sNumber = Integer.toString(n);
            int square = 0;
            for (int i = 0; i<sNumber.length(); ++i) {
                String no = String.valueOf(sNumber.charAt(i));
                int number = Integer.valueOf(no);
                square += number*number;
            }
            if (allNums.contains(square)) return false;
            else {
                n = square;
                allNums.add(n);
            }
        }

        return true;
    }
}
