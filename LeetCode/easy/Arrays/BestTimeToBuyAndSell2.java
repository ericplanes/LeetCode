package Arrays;

class BestTimeToBuyAndSell2 {
    public static void main(String[] args) {
        int[] input = { 7, 1, 5, 3, 6, 4 };
        int expected = 7;
        int k = maxProfit(input);
        if (expected == k) {
            System.out.println(expected + " == " + k);

        } else {
            System.out.println(expected + " != " + k);
        }
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
