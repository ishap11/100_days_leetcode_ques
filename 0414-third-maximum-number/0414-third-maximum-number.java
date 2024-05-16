class Solution {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (int num : nums) {
            // Check if the current number is greater than the first maximum
            if (num > max1) {
                // Update the third and second maximums accordingly
                max3 = max2;
                max2 = max1;
                max1 = num;
            } 
            // Check if the current number is between the first and second maximums
            else if (max1 > num && num > max2) {
                // Update the third maximum
                max3 = max2;
                max2 = num;
            } 
            // Check if the current number is between the second and third maximums
            else if (max2 > num && num > max3) {
                // Update the third maximum
                max3 = num;
            }
        }
        return max3 != Long.MIN_VALUE ? (int) max3 : (int) max1;
    }
}