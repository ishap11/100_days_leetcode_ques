class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        /*
        // BRUTE FORCE - O(n^2) SC - O(1)
        List<Integer> ans = new ArrayList<>();
        for(int i=0 ; i< nums.length; i++){
            for(int j= i+1; j< nums.length ; j++){
                if(nums[i] == nums[j]){
                    ans.add(nums[i]);
                }
            }
        }
        return ans;
        */


        /*
        // ANother approach  - TC - O(nlogn) SC - O(1)
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=1; i< nums.length ; i++){
            if(nums[i] == nums[i-1]){
                ans.add(nums[i]);
            }
        }
        return ans;
        */


        // Another approach - TC - O(n) Sc - O(n)
        HashSet<Integer> set = new HashSet<>(); 
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0;i<nums.length;i++){
            if(!set.add(nums[i])){
                ans.add(nums[i]);
            }
        }
        return ans;

        /*
        // Another approach TC - O() SC -O()
        class Solution {
            public List<Integer> findDuplicates(int[] nums) {
                List<Integer> ans = new ArrayList<>();
                int n = nums.length;
                for (int i = 0; i < n; i++) {
                    int x = Math.abs(nums[i]);
                    if (nums[x - 1] < 0) {
                        ans.add(x);
                    }
                    nums[x - 1] *= -1;
                }
                return ans;
            }
        }
        */
        
    }
}