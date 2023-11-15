class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // BRUTE FORCCE APPROACH
        // TC - O(n1 +n2) SC - O(n1+n2)

        // int n1 = nums1.length;
        // int n2 = nums2.length;
        // int n = n1 + n2;
        // int[] res = new int[n];

        // int i=0;
        // int j=0;
        // int k=0;

        // while(i < nums1.length && j < nums2.length){
            // if(nums1[i]<nums2[j]){
            //     res[k++] = nums1[i++];
            // }else{
            //     res[k++] = nums2[j++];
            // }
           
        // }
        // while (i < n1) {
        //     res[k++] = nums1[i++];
        // }
        // while (j < n2) {
        //     res[k++] = nums2[j++];
        // }
        // if( n % 2 == 0){
        //     return (double) (res[n / 2 - 1] + res[n / 2]) / 2.0;
        // }else{
        //     return (double)res[n/2];
        // }



        // BETTER APPROACH
        // TC - O(n1+n2) SC - O(1)

        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int ind2 = (n1+n2)/2;
        int ind1 =( (n1+n2)/2) -1;
        int count =0;
        int ind1element = -1;
        int ind2element = -1;
        int i=0;
        int j=0;

        while(i < n1 && j < n2){
            if(nums1[i]<nums2[j]){
                if (count == ind1) ind1element = nums1[i];
                if (count == ind2) ind2element = nums1[i];
                count++;
                i++;
            }else{
                if (count == ind1) ind1element = nums2[j];
                if (count == ind2) ind2element = nums2[j];
                count++;
                j++;
            } 
        }
        while (i < n1) {
            if (count == ind1) ind1element = nums1[i];
            if (count == ind2) ind2element = nums1[i];
            count++;
            i++;
        }
        while (j < n2) {
            if (count == ind1) ind1element = nums2[j];
            if (count == ind2) ind2element = nums2[j];
            count++;
            j++;
        }
        if (n % 2 == 1) {
            return (double)ind2element;
        }

        return (double)((double)(ind1element + ind2element)) / 2.0;




        // OPTIMAL APPROACH
        // TC - O(log(n1,n2)) SC - O(1)


    }
}