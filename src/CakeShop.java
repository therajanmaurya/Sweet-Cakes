import java.util.ArrayList;
import java.util.List;

public class CakeShop {

    public static void main(String[] args) {
        System.out.println("Main");
        ArrayList<Integer> logs = new ArrayList<>() {{
            //add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
        }};
        findMissingLog(logs);
    }

    private static int findMissingLog(List<Integer> sortedLogIds) {
        int misingLog = -1;
        for (int i =0; i<sortedLogIds.size(); ++ i) {
            if ((i+1) != sortedLogIds.get(i)) {
                misingLog = (i +1);
                System.out.println(misingLog);
                return misingLog;
            }
        }
        return misingLog;
    }
}
