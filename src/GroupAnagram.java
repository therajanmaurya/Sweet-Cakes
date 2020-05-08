import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

    public static void main(String[] args) {

        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> out = new ArrayList<>();

        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            if (map.containsKey(String.valueOf(ch))) {
                List<String> listC = map.get(String.valueOf(ch));
                listC.add(s);
                map.put(String.valueOf(ch), listC);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(String.valueOf(ch), list);
            }
        }

        for (List<String> li : map.values()) {
            out.add(li);
        }

        return out;
    }
}
