class Solution {
    public int first(int[] nums , int target){
        int lo = 0;
        int hi = nums.length - 1;
        int ans =-1;

        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(nums[mid] == target){
                ans = mid;
                hi = mid -1;
            }else if(nums[mid] < target){
                lo = mid +1;
            }else{
                hi = mid -1;
            }
        }
        return ans;
    }
    public int last(int[] nums , int target){
        int lo = 0;
        int hi = nums.length - 1;
        int ans =-1;

        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(nums[mid] == target){
                ans = mid;
                lo = mid + 1;
            }else if(nums[mid] < target){
                lo = mid +1;
            }else{
                hi = mid -1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums, target), last(nums, target)};
    }
}