class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // TC - O(n) SC - O(1)
      int[] arr = new int[nums.length];
        int i=0;
        int j=arr.length-1;
        for(int num:nums){
            if(num%2==0) arr[i++] = num;
            else arr[j--] = num;
        }
        return arr;


    // TC - O(n) Sc - O(1)
        // int i=0;
        // int j= nums.length-1;

        // while(i<= j){
        //     // first odd last even
        //     if(nums[i]% 2== 1 && nums[j]%2 == 0 ){
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //     }
        //     // first even last odd
        //     else if(nums[i]% 2== 0 && nums[j]%2 == 1){
        //         i++;
        //         j--;
        //     }
        //     // first even last even
        //     else if (nums[i]% 2== 0 && nums[j]%2 == 0){
        //         i++;
        //     }
        //     // last odd first odd
        //     else{
        //         j--;
        //     }
        // }
        // return nums;
    }


}