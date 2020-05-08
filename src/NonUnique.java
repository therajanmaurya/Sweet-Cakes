import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class NonUnique {

    public static void main(String[] args) {
        int max = 0;
        int[] arr = new int[] {1, 3, 1, 4, 5, 6, 3, 2};
        List<Integer> list = new ArrayList<>();
        /*list.add(1);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(2);*/

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);


        //countNonUnique(list);
        System.out.println("A");
    }

    public static void main(String args) {
        System.out.println("B");

    }

    public static int countNonUnique(List<Integer> numbers) {
        // Write your code here
        HashMap<Integer, Integer> set = new HashMap<>();

        if(numbers.size() <= 1) return 0;
        int count = 0;
        for(int i = 0; i < numbers.size(); i++) {
            if(set.containsKey(numbers.get(i))) {
                if(set.get(numbers.get(i)) == 1) {
                    count++;
                    System.out.println(count);
                    int k = set.get(numbers.get(i)) + 1;
                    set.put(numbers.get(i), k);
                } else {
                    int k = set.get(numbers.get(i)) + 1;
                    set.put(numbers.get(i), k);
                }
            } else {
                set.put(numbers.get(i), 1);
            }
        }

        return count;
    }
}
