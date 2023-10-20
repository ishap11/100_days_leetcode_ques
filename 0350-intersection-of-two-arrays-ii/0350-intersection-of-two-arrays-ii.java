class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int m = nums1.length; //O(mlog(m))
        int n = nums2.length; //O(nlog(n))
        int[] nums3 = new int[Math.min(m, n)]; //o(min(m, n))
        int i =0 ; 
        int j =0;
        int k =0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<m && j<n){
            if(nums1[i] == nums2[j]){
                nums3[k] = nums1[i];
                i++;
                j++;
                k++;
            }else if(nums1[i]< nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        // Create a new array of size k and copy the elements from nums3 into it
        //  The nums3 array might have unused space at the end if the intersection size is less than the minimum of the lengths of nums1 and nums2. To address this issue, you can create a new array of size k (where k represents the actual number of intersecting elements) and copy the elements from nums3 into this new array before returning it. Here's how you can do it:
        int[] result = new int[k];
        System.arraycopy(nums3, 0, result, 0, k);
        return result;


// APPROACH -2 HASHMaP Learn it
    }
}