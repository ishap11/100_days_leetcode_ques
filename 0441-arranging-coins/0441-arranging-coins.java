class Solution {
    public int arrangeCoins(int n) {
        int i =1;
        int res = 0;

        while(i<=n){
            n -=i;
            res ++;
            i++;
        }
        return res;
    }
}