class Solution {
    public int mySqrt(int x) {
       if(x == 0  || x == 1) {
           return x;
           
       }
       long first = 0, last = x/2, ans=0; 
        while(first <= last){
            long mid = (first + last)/2;
            if(mid*mid < x){
                first = mid +1;
                ans= mid;
            }
            else if(mid*mid == x){
                return (int)mid;
            }
            else{
                last = mid-1;
            }
        }
       return (int)ans;
    }
    
}