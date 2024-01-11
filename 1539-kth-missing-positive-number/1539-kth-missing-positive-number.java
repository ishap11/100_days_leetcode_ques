class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            int mis=arr[mid]-(mid+1);
            if(mis<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(high != -1){
            int missingValCount = arr[high]-(high+1);
            return arr[high]+(k-missingValCount);
        }
        return k;
    }
}