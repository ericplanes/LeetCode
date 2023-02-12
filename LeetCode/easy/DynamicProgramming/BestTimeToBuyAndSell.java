package DynamicProgramming;

class BestTimeToBuyAndSell {

    public static void main(String args[]) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int expected = 5;
        System.out.println("Expected: " + expected);
        System.out.println("Got: " + maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
}