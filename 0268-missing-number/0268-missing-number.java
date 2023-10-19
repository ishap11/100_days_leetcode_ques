class Solution {
    public int missingNumber(int[] nums) {

        // AppROACH -1 TC - O(N) SC - O(1)
        int n = nums.length;
        int totalSum = n*(n+1)/2;
        int sum = 0;
        for(int i=0; i< nums.length ; i++){
            sum = sum + nums[i];
        }
        return totalSum - sum;

        // Approach 2 TC - O(N) SC - O(1)
    //    int n= nums.length;
    //    int sum = 0;
    //    for(int i=0 ; i< nums.length ; i++){
    //        sum  = sum + nums[i];
    //    }
    //    return (int)((double)n/2*(1+n)-sum);

    // APPROACH -3 {HASHSET}{Solution learn}
    }
}