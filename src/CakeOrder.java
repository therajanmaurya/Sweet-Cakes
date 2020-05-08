public class CakeOrder {

    public static void main(String[] args) {
        System.out.println(sum1ToN(3));
    }

    public static int sum1ToN(int n) {
        // base case:
        if (n <= 1) return 1;

        return n + sum1ToN(n-1);
    }
}
