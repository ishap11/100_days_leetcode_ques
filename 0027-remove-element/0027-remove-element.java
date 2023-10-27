class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0; //slow-remove element
        // j _> fast - iteration
            for(int j=0; j< nums.length ; j++){
                if(nums[j] != val){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
            }
        return i;
    }
}