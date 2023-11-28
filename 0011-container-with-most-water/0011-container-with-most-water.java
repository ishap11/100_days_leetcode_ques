class Solution {
    public int maxArea(int[] height) {
        // TC - O(n) Sc - O(1)
        int res =0;

        int li =0;
        int ri= height.length-1;

        while(li < ri){
            int left = height[li];
            int right = height[ri];
            int area = Math.min(left , right)*(ri - li);
            res = Math.max(res , area);

            if(left < right) li++;
            else ri--;
        }
        return res;
    }
}