class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // TC - O(nlogn) SC -O(n)
    //   Arrays.sort(nums);
    //   List<Integer> list= new ArrayList<>();
    //   for(int i=0; i< nums.length; i++){
    //       if(nums[i] == target){
    //           list.add(i);
    //        }
    //     } 
    //     return list;

    // ANOTHER APPROACH
    // TC -O(N) SC -O(1)
    int countTarget = 0 , lessTarget = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<target) lessTarget++;
            if(nums[i]==target) countTarget++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<countTarget; i++){
            ans.add(lessTarget + i);
        }
        return ans; 
    }
}