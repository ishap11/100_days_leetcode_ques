class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0;
        int ans = Integer.MIN_VALUE;

        for(int i=0; i< nums.length  ;i++){
            sum = sum + nums[i]; //calculate sum

            ans = Math.max(ans ,sum); 
            //max sum me se ans me se kya h vo stre krrhe h 
            if(sum <0){  //check agr element -ve h toh consider hi ni krna
                sum=0;
            }
        }
        return ans;
    }
}