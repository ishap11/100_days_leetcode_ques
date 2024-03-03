class Solution {
    public int findKthLargest(int[] nums, int k) {

        // Brute force => TC - O(nlogn) SC - O(1)
        // Arrays.sort(nums);
        // int smax = 0;
        // for(int i=0; i< nums.length  ;i++){
        //     smax = nums[nums.length-k];
        // }
        // return smax;


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i<nums.length ; i++){
            if(i<k){
                pq.add(nums[i]);
            }else{
                if(nums[i] > pq.peek()){
                    pq.remove();
                    pq.add(nums[i]);
                }
            }
        }
        while(pq.size() > 0){
            return pq.remove();
        }
        return k;

       
    }
}