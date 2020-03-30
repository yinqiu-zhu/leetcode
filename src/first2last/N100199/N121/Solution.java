package first2last.N100199.N121;

class Solution {
    public int maxProfit(int[] prices) {
        int lowest = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++ ){

            if (lowest > prices[i]) {
                lowest = prices[i];
            }
            else {
                maxProfit = prices[i] - lowest > maxProfit?  prices[i] - lowest : maxProfit;
            }
        }

        return maxProfit;
    }
}