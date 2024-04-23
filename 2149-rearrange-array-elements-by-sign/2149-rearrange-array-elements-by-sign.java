class Solution {
    public int[] rearrangeArray(int[] nums) {

        /*
        // Brute force -> TC - O(N) SC - O(N)
        List<Integer> posnums = new ArrayList<>(); //SC - O(n/2) {worst case}
        List<Integer> negnums = new ArrayList<>(); //SC - O(n/2) {worst case}
        List<Integer> ans = new ArrayList<>(); //SC - O(n/2) {worst case}

        // TC -O(N)
        for(int i=0; i< nums.length; i++){
            if(nums[i] < 0){
                negnums.add(nums[i]);
            }else{
                posnums.add(nums[i]);
            }
        }

        // TC -O(n/2) + O(n/2) = O(n)
        int ind1 = 0, ind2 = 0;
        while (ind2 < nums.length / 2) {
            ans.add(posnums.get(ind1));
            ind1++;
            ans.add(negnums.get(ind2));
            ind2++;
        }
         // Convert List<Integer> to int[] - TC = O(N) SC - O(N)
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
        */


        // Two pointer approach{optimised approach} => TC - O(n) SC => O(n)

        int pos = 0;
        int neg = 1;
        int[] res = new int[nums.length];

        for(int i=0; i< nums.length; i++){
            if(nums[i] > 0 ){
                res[pos] = nums[i];
                pos +=2;
            }else{
                res[neg] = nums[i];
                neg += 2;
            }
        }
        return res;
    }
}