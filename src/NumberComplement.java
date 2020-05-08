public class NumberComplement {

    public static void main(String[] args) {
        System.out.println(getBinary(5));
    }

    public static int getBinary(int num) {
        int[] binary = new int[40];
        int index = 0;
        while (num > 0) {
            binary[index] = num % 2;
            num /= 2;
            index++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = index - 1; i >= 0; i--) {
            if (binary[i] == 0) {
                sb.append(1);
            } else {
                sb.append(0);
            }
        }

        return getDecimal(Integer.parseInt(sb.toString()));
    }

    public static int getDecimal(int binary) {
        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }
        return decimal;
    }
}
