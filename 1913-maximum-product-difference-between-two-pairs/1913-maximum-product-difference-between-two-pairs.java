class Solution {
    // TC - O(nlogn) SC - O(1)
    public int maxProductDifference(int[] nums) {

        /*
       Arrays.sort(nums);
       int ans =0;
       for(int i=0; i< nums.length ; i++){
           int fm = nums[(nums.length-1)]*nums[(nums.length-2)];
           int sm = nums[0] * nums[1];
           ans = fm - sm;
       } 
       return ans;
       */

    //    TC- O(n) SC - O(1)
       int firstBigNo = 0;
       int secondBigNo = 0;
       int firstSmallNo = Integer.MAX_VALUE;
       int secondSmallNo = Integer.MAX_VALUE;

       for(int i=0; i< nums.length ; i++){
           if(nums[i]<firstSmallNo){
               secondSmallNo = firstSmallNo;
               firstSmallNo = nums[i];
           }else if(nums[i] < secondSmallNo){
               secondSmallNo = nums[i];
           }
           if(nums[i]>firstBigNo){
               secondBigNo = firstBigNo;
               firstBigNo = nums[i];
           }else if(nums[i] > secondBigNo){
               secondBigNo = nums[i];
           }
       }
       return firstBigNo * secondBigNo - firstSmallNo * secondSmallNo; 
    }
}