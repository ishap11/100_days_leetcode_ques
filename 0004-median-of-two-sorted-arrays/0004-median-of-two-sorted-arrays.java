class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // BRUTE FORCCE APPROACH
        // TC - O(n1 +n2) SC - O(n1+n2)

        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] res = new int[n];

        int i=0;
        int j=0;
        int k=0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i]<nums2[j]){
                res[k++] = nums1[i++];
            }else{
                res[k++] = nums2[j++];
            }
           
        }
        while (i < n1) {
            res[k++] = nums1[i++];
        }
        while (j < n2) {
            res[k++] = nums2[j++];
        }
        if( n % 2 == 0){
            return (double) (res[n / 2 - 1] + res[n / 2]) / 2.0;
        }else{
            return (double)res[n/2];
        }
    }
}