import java.util.HashMap;

public class FirstUniqChar {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("cc"));
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap();

        int non_rep = -1;

        char[] un = s.toCharArray();

        if (un.length == 1) return 0;

        for (int i = 0; i < un.length; i++) {
            if (map.containsKey(un[i])) {
                int a = map.get(un[i]);
                map.put(un[i], ++a);
            } else {
                map.put(un[i], 1);
            }
        }

        for (int j = 0; j < un.length; j++) {
            if (map.get(un[j]) == 1) {
                non_rep = j;
                break;
            }
        }

        return non_rep;
    }
}
