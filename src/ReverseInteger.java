public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(-35346));
    }

    private static int reverse(int x) {

        StringBuilder sb = new StringBuilder();
        char[] arr = String.valueOf(x).toCharArray();

        if (arr.length == 1) {
            return x;
        }

        if (arr[0] == '-') {
            sb.append('-');
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != '-') {
                sb.append(arr[i]);
            }
        }

        try {
            return Integer.parseInt(sb.toString());
        } catch (Exception e) {
            return 0;
        }
    }

    public int reverse1(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
