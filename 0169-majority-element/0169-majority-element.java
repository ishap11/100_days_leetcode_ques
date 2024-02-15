class Solution {
    public int majorityElement(int[] nums) {
        /*
        // Brute froce - O(N^2) SC - O(1)
        for(int i =0  ;i< nums.length  ;i++){
            int count = 0;
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[i]== nums[j]){
                    count++;
                } 
            }
            // check if frquency is greater than n/2:
            if(count > nums.length/2){
                return  nums[i];
            }
        }
        return  -1;
        */

        /*
        // Better approach - Hasmap 
        // TC - O(N*logN) SC - O(N) as we are using a map data structure.

        //size of the given array:
        int n = nums.length;

        //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();

        //storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i], value + 1);
        }

        //searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;
        */


        // OPTIMISED APPROSCH =>MOORE's VOTING ALGO TC- O(N) SC - O(1)

        int val = nums[0];
        int count =1;

        for(int i=1; i< nums.length ;i++){
            if(nums[i] == val){
                count++;
            }else{
                count--;
               
            }
             if(count == 0){
                val = nums[i];
                count =1;
            }
        }
        return val;
    }
}