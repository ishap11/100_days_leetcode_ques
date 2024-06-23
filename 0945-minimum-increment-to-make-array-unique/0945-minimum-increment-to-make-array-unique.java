class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int count=0;

        for(int i=1; i< nums.length; i++){
            while(nums[i-1] >= nums[i]){
                int increment = nums[i-1] -nums[i] +1;
                nums[i] += increment;
                count += increment;
            }
        }
        return count;
    }
}