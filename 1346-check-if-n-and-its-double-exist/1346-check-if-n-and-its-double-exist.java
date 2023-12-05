class Solution {
    public boolean checkIfExist(int[] arr) {
        // TC - O(N^2) SC  -O(1)
        /*
        for(int i=0 ;i< arr.length; i++){
            for(int j= 0; j< arr.length ; j++){
                if( i != j && arr[i] == 2*arr[j]) return true;
            }
        }
        return false;
        */

        // ANOTHER APPROACH
        // TC-O(n logn) SC - O(1)
        Arrays.sort(arr);
        for(int i=0  ; i< arr.length ; i++){
            int target = 2*arr[i];
            int li=0; 
            int ri= arr.length -1;
            
            while(li <= ri){
                int mid = (li + ri) /2;
                if(arr[mid] == target && mid != i) {
                    return true;
                }else if(arr[mid] <target) {
                    li = mid+1;
                }else{
                    ri = mid -1;
                }
            }
        }
        return false;
    }
}