class Solution {
    public String addStrings(String num1, String num2) {
        // TC - : O(max(N, M)) Sc - O(1)
        String res = "";
        int i = num1.length() -1;
        int j = num2.length() -1;
        int carry =0;

        while(i>=0 || j>= 0 || carry != 0){
            int ival = i>= 0 ? num1.charAt(i)-'0':0;
            int jval = j>=0 ? num2.charAt(j) - '0': 0;
            i--;
            j--;

            int sum = ival + jval + carry;
            res = (sum%10) + res;
            carry = sum/10;
        }
        return res;
    }
}