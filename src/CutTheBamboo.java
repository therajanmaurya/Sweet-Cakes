import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CutTheBamboo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(4);
        list.add(2);
        list.add(2);
        list.add(8);
        System.out.println(cutBamboo(list));
    }

    public static List<Integer> cutBamboo(List<Integer> lengths) {
        List<Integer> output = new ArrayList<>();

        Collections.sort(lengths);
        int numRemove = 0;

        if(lengths.size() == 1) {
            output.add(1);
            return output;
        }


        while(!lengths.isEmpty()) {
            output.add(lengths.size());
            int t = lengths.get(0);
            for (int i = 0; i < lengths.size(); i++) {
                lengths.set(i, lengths.get(i) - t);
                if(lengths.get(i) == 0) numRemove++;
            }

            while(numRemove != 0) {
                lengths.remove(0);
                numRemove--;
            }
        }

        return output;
    }


    /*private static List<Integer> cutBamboo(List<Integer> lengths) {
        List<Integer> output = new ArrayList<>();

        Collections.sort(lengths);

        return lengths;
    }*/
}
