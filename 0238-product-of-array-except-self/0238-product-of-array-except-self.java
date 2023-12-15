class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];

        prefix[0] = 1;
        for(int i=1; i<prefix.length ;i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }
        suffix[suffix.length-1] = 1;
        for(int i=suffix.length -2; i>=0 ;i--){
            suffix[i] = suffix[i+1]*nums[i+1];
        }
        int[] ans = new int[nums.length];
        for(int i=0; i<ans.length ; i++){
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
        */

        int[] ans = new int[nums.length];
        // Calculate prefix products
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefix;
            prefix *= nums[i];
        }
         int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }
        return ans;
    }
}