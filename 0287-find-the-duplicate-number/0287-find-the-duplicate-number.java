class Solution {
    public int findDuplicate(int[] nums) {
       // TC:O(Nlogn + N)
        // Rsn: NlogN for sorting the array and O(N) for traversing through the array  and checking if adjacent elements are equal or not. But this will distort the array.
    // SC - O(1)
        // Arrays.sort(nums);
        // for(int i = 0 ; i< nums.length ; i++){
        //     if(nums[i] == nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return 0;


        // TC - O(n) SC - O(n)
        int n =  nums.length;
        int freq[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (freq[nums[i]] == 0) {
                freq[nums[i]] += 1;
            } else {
                return nums[i];
            }
        }
        return 0;


    }
}

