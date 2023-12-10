class Solution {
    public int reverse(int x) {
        // int ans = 0;
        // while(x != 0){
        //     int digit = x%10; //123 -> 3 digits laane ke liye

        //     // for special case
        //     if((ans > Integer.MAX_VALUE/10) || (ans < Integer.MIN_VALUE/10)){
        //         return 0;
        //     }

        //     ans = ans * 10 + digit; 
        //     x = x/10; // ab 3 as digit chla gya toh 3 ko remove krne ke liye
        // }
        // return ans;

        // again try
        boolean neg = false;
        if(x<0) {
            neg = true;
            x = -x;
        }
        long ans = 0;
        while(x != 0){
            int rem = x % 10;
            ans  =ans*10+ rem;
            x= x/10;
        }
        if(neg) ans = -ans;
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
            return 0;
        }
        return (int) ans;
    }
}