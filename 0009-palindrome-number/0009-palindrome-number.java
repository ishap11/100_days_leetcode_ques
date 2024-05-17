class Solution {
    public boolean isPalindrome(int x) {
        // TC- O(N) SC - O(1)
        // if(x < 0 ){
        //     return false; //since -ve no. can't be a palindrome
        // }
        // int temp = x;
        // int reverseNum = 0;
        // while(temp != 0){
        //     int digit = temp  %10;
        //     reverseNum = reverseNum *10 +  digit;
        //     temp = temp/10;
        // }
        
        // if(reverseNum == x){
        //     return true;
        // }else{
        //     return false;
        // }


        // Again solving
        //TC - O(n) SC - O(1)
        if(x< 0){
            return false;
        }
        if(x ==0 ){
            return true;
        }

        int ans =0;
        int orgnlNo = x;

        while(x != 0){
            int rem = x%10;
            x = x/10;
            ans = ans*10 + rem ;
        }
        return ans == orgnlNo;
    }
}