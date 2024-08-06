public class StockBuyAndSell {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            profit = prices[i] - minPrice;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}
