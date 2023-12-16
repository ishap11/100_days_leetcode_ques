class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n= nums.length;
        int[] even = new int[(n+1)/2];
        int[] odd = new int[n/2];
        int evenIndex = 0;
        int oddIndex = 0;
        for(int i=0; i<n; i++){
            if(i%2 == 0){
                even[evenIndex++] = nums[i];
            }else{
                odd[oddIndex++] = nums[i];
            }
        }

        Arrays.sort(even);
        Arrays.sort(odd);

        int evenIndex1 =0;
        int oddIndex1 = n/2 -1;
        for(int i=0; i<n ; i++){
            if(i%2 == 0){
                nums[i] = even[evenIndex1++];
            }else{
                nums[i] = odd[oddIndex1--];
            }
        }
        return nums;
    }
}