class Solution {
    public int buyChoco(int[] prices, int money) {
        // TC - O(nlogn) SC - O(1)
        // Arrays.sort(prices);
        // for(int i=0; i< prices.length ;i++){
        //     if( prices[0] + prices[1] <= money ){
        //         return money - (prices[i] +prices[i+1]); 
        //     }
        // }
        // return money;


        // TC - O(n) SC- O(1)
        int first_min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for(int i=0; i< prices.length ;i++){
            if(prices[i] < first_min){
                second_min = first_min;
                first_min = prices[i];
            }else if(prices[i] < second_min){
                second_min = prices[i];
            }
        }
        return (first_min + second_min <= money) ? money -(first_min + second_min): money;
    }
}