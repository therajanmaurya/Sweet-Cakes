public class MaxProfit {

    public static void main(String[] args) {
        System.out.println(findMaxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int findMaxProfit(int[] stocks) {
        int min_value = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < stocks.length; i++) {
            if (stocks[i] < min_value) {
                min_value = stocks[i];
            } else if (stocks[i] - min_value > profit) {
                profit = stocks[i] - min_value;
            }
        }
        return profit;
    }
}
