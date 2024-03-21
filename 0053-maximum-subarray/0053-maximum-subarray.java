class Solution {
    public int maxSubArray(int[] nums) {
        // BRUTE FORCE  T(c)- O(n^3) Sc - O(1)
        // int ans = Integer.MIN_VALUE;
        // for(int i=0; i< nums.length ;i++){
        //     for(int j= i ; j< nums.length ; j++){
        //         int sum =0;
        //         for(int k= i ; k< j; k++){
        //             sum += nums[k];
        //         }
        //         ans = Math.max(sum , ans);
        //     }
        // }
        // return ans;

//         Optimised Approach TC - O(N) SC - O(1)
        int sum =0;
        int ans = Integer.MIN_VALUE;

        for(int i=0; i< nums.length  ;i++){
            sum = sum + nums[i]; //calculate sum

            ans = Math.max(ans ,sum); 
            //max sum me se ans me se kya h vo store krrhe h 
            if(sum <0){  //check agr element -ve h toh consider hi ni krna
                sum=0;
            }
        }
        return ans;
    }
}