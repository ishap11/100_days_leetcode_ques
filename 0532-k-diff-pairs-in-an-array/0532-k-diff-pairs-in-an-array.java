class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count =0;
        for(int i= 0 ; i< nums.length  ;i++)
        {
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j = i+1 ; j< nums.length ; j++){
                if(Math.abs(nums[i] - nums[j]) == k  && i != j){
                    count++;
                    break;
                }

            }
        }
        return count;

        // Arrays.sort(nums);
        // int n = nums.length;
        // int count =0;

        // int i=0; 
        // int j = nums.length;
        // while(j<n){
           
        //     int diff = Math.abs(nums[i] - nums[j]);

        //     if(diff > k){
        //         j--;
        //     }else if(diff < k){
        //         i++;
        //     }else{
        //         count++;
        //     }
        // }
        // return count;
    }
}