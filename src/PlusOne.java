public class PlusOne {

    public static void main(String[] args) {
        int[] a = new int[]{9, 9, 9};

        int[] b = plusOne(a);
        for (int c : b) {
            System.out.println(c);
        }
    }

    public static int[] plusOne(int[] digits) {

        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] += 1;
            return digits;
        }

        int carry = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            int v = digits[i] + carry;

            if (i == digits.length - 1) {
                v += 1;
            }

            if (v < 10) {
                digits[i] = v;
                return digits;
            } else if (v == 10) {
                digits[i] = 0;
                carry = 1;
            }
        }

        if (carry == 1) {
            int[] arr = new int[digits.length + 1];
            arr[0] = carry;

            for (int j = 1; j < arr.length - 1; j++) {
                arr[j] = digits[j - 1];
            }
            return arr;
        } else {
            return digits;
        }
    }
}
