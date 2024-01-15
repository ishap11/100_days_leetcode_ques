class Solution {
    public int maxProfit(int[] prices) {
        // TC - O(N) SC - O(1)
        int buy = Integer.MAX_VALUE;
        int sell = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            else if(prices[i] - buy > sell){
                sell = prices[i] - buy;
            }
        }

        return sell;
    }
}
