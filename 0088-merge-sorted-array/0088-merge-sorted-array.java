class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // brute force approach
        // TC - O(n+m)+ O(n+m)  
        //   SC = O(n+m)

        int[] nums3 = new int[m + n];
        int left = 0;
        int right = 0;
        int index = 0;

        while (left < m && right < n) {
            if (nums1[left] <= nums2[right]) {
                nums3[index] = nums1[left];
                left++;
            } else {
                nums3[index] = nums2[right];
                right++;
            }
            index++;
        }

        while (left < m) {
            nums3[index++] = nums1[left++];
        }

        while (right < n) {
            nums3[index++] = nums2[right++];
        }

// copying element from nums3 to nums1
        for (int i = 0; i < m + n; i++) {
            nums1[i] = nums3[i];
        }


// OPTIMAL APPROACH
    }
}

