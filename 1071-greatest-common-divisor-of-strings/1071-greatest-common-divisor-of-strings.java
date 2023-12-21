class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if((str1 + str2).equals(str2  +str1)){  //O(n+m)
            int a = str1.length();
            int b= str2.length();
            int gcd = gcd(a,b);
            return str1.substring(0,gcd); //O(n+m)
        }else{
            return "";
        }
    }
    int gcd(int a, int b){
        while(b%a != 0){
            int res = b%a;
            b =a;
            a = res;
        }
        return a;
    }
}