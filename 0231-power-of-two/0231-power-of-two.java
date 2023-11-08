class Solution {
    public boolean isPowerOfTwo(int n) {
        // brute force : -0-30 loop  chla if 2^x == n aaya toh yes ni toh No
        for(int i = 0; i<=30 ; i++){
            int ans = (int)Math.pow(2,i);
            if(ans == n){
                return true;
            }
        }
        return false;
    }
}