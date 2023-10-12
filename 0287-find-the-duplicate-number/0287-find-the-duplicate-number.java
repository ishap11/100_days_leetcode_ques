class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }
}
// Time Complexity:O(Nlogn + N)
// Reason: NlogN for sorting the array and O(N) for traversing through the array and checking if adjacent elements are equal or not. But this will distort the array.
// SC - O(1)
