package leetcode_ques.sliding_window;

public class BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;

        int maxProfit = 0;

        while(sell < prices.length) {
            if(prices[buy] < prices[sell]) {
                int profit = prices[sell] - prices[buy];
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buy = sell;
            }
            sell++;
        }

        return maxProfit;
    }
}
