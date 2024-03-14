class Solution {
    public int searchInsert(int[] nums, int target) {
        int li =0;
        int ri = nums.length-1;

        while(li<=ri){
            int mid = (li+ri)/2;
            if(target > nums[mid]){
                li = mid+1;
            }else if(target < nums[mid]){
                ri = mid-1;
            }else{
                return mid;
            }
        }
        return li;
    }
}