class Solution {
    public int findMin(int[] nums) {
        // 3 5 4 1 2 ...left=>3 right=>2 mid=>5 
        // nums[mid] = 5 > nums[right] = 2 ==> left = mid +1 => left = 1
        // left => 1 right=>2 mid=> 1
        // nums[mid] = 1 < nums[right] ==> right = mid ==> right =1 {ans return }
        // tc - O(logn) SC - O(1)
        int left = 0;
        int right = nums.length -1;

        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right]){
                left = mid +1;
            }else{
                right = mid; //here including mid too
            }
        }
        return nums[right];
    }
}