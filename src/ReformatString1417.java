public class ReformatString1417 {

    public static void main(String[] args) {
        System.out.println(reformat("covid2019"));
    }

    public static String reformat(String s) {
        StringBuilder chars = new StringBuilder();
        StringBuilder ints = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                chars.append(c);
            } else {
                ints.append(c);
            }
        }

        if (Math.abs(chars.toString().length() - ints.toString().length()) > 1) return "";

        if ((chars.toString().length() == ints.toString().length()) || chars.toString().length() < ints.toString().length()) {
            return buildString(ints.toString(), chars.toString());
        } else {
            return buildString(chars.toString(), ints.toString());
        }

    }

    private static String buildString(String s1, String s2) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            s.append(s1.charAt(i));
            if (s2.length() > i) s.append(s2.charAt(i));
        }

        return s.toString();
    }
}
