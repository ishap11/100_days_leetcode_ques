class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        // TC- O(n) SC - O(1)
        int count =0;

        for(int num: arr){
            if(num % 2 !=0){
                count+=1; //odd 
            }else{
                count =0; 
            }
            if(count ==3){
                return true;
            }
        }
        return false;
    }
}

// Approach
// Step-1 -> Just loop through given input array.
// Step-2 -> Check if element is odd just increment count else reset count.
// Step-3 -> Need check for 3 consecutive odd numbers if found return true.
// Step-4 -> Else return false in the end which means not found