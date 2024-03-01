class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        
        Arrays.sort(nums);
        int count = 1;
        int max_count = 1;
        
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i + 1] - nums[i] == 1) {
                count++;
            } else if(nums[i + 1] - nums[i] == 0) {
                continue; 
            } else {
                max_count = Math.max(max_count, count);
                count = 1; 
            }
        }
        return Math.max(max_count, count);
    }
}