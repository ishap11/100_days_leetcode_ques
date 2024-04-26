class Solution {
    public int singleNumber(int[] nums) {
        // Arrays.sort(nums);
        // int i = 0;
        // while(i<nums.length-1){
        //     if(nums[i]==nums[i+1]){
        //         i = i+2;
        //     }
        //     else{
        //         break;
        //     }
            
        // }
        // return nums[i];
        
        int n  = nums.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i], value + 1);
        }

        //Find the single element and return the answer:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }
        return -1;
        
        
        // METHOd-3
        // int a =0;
        // for(int i=0 ; i<nums.length ; i++){
        //     a = a^nums[i];
        // }
        // return a;
    }
}