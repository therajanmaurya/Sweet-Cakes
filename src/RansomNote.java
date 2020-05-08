import java.util.HashMap;

public class RansomNote {

    public static void main(String[] args) {
        System.out.println(canConstruct1("bbg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
    }

    public static boolean canConstruct1(String ransom, String magazine) {
        if (magazine.length() < ransom.length()) return false;
        int caps[] = new int[26];
        for (char c : ransom.toCharArray()) {
            int index = magazine.indexOf(c, caps[c - 'a']);
            if (index == -1)
                return false;
            caps[c - 97] = index + 1;
        }
        return true;
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap();

        for (char r : ransomNote.toCharArray()) {
            if (map.containsKey(r)) {
                int d = map.get(r);
                map.put(r, ++d);
            } else {
                map.put(r, 1);
            }
        }

        for (char m : magazine.toCharArray()) {
            if (map.containsKey(m)) {
                int d = map.get(m);
                map.put(m, --d);
            }
        }

        for (int i : map.values()) {
            if (i > 0) return false;
        }

        return true;
    }
}
