class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buyMin = prices[0];

        for(int i = 1; i < prices.length; i++){
            buyMin = Math.min(prices[i], buyMin);
            int profit = prices[i]-buyMin;
            max = Math.max(profit, max);
        }
        return (max < 0) ? 0 : max;
    }
}
