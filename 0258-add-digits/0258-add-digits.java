class Solution {
    public int addDigits(int num) {
        // TC - O(logN) SC - )(1)
        // rsn -> The loop runs until num becomes a single-digit number. In the worst-case scenario, where num is a large number with k digits, the number of iterations required to reduce it to a single digit can be considered as log10(num), which is logarithmic with base 10, representing the number of digits in num
        int ans = 0;
        while(num >9){
            int digit = num %10;
            int pwr = num / 10;
            ans = digit + pwr;
            num = ans;
        }
        return num;
    }
}