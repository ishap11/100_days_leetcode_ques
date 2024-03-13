class Solution {
    public boolean check(int[] nums) {
    int c = 0;
    for(int i = 1;i < nums.length; i++){
        if(nums[i-1] > nums[i]){
            c++;
        }
    }
    if(nums[nums.length-1] > nums[0]) {
        c++;
    }
    return c <= 1; 
    }
}