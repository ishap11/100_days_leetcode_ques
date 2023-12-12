class Solution {
    public int maxProduct(int[] nums) {
        /*
        // APPROACH -1 {BRUTE FORCE}
        // TC-O(n2) SC -O(1)
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int currentProduct = (nums[i] - 1) * (nums[j] - 1);
                maxProduct = Math.max(maxProduct, currentProduct);
            }
        }
        return maxProduct;
        */

        
        // APPROACH -2 {WITHOUT SORTING}
        // TC - O(n) SC - O(1)
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int num :  nums){
            if(num >= max1){
                max2 = max1;
                max1 = num;
            }else if(num > max2){
                max2 = num;
            }
        }
        return (max1 - 1) * (max2 - 1);
        


         /*
        // APPROACH - 3{WITH SORTING}
        // TC - O(log n) SC - O(1)
        Arrays.sort(nums);
        int x = nums[(nums.length-1)];
        int y= nums[(nums.length-2)];
        int maxProduct = (x-1) *(y-1);
        return maxProduct; 
        */ 
    }
}