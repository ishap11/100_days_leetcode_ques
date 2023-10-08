class Solution {
    public void moveZeroes(int[] nums) {
        // TC- O(N) SC - O(1)
        int i = 0;
        int j = 0;
        int temp;

        while (i < nums.length) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
    }
}
