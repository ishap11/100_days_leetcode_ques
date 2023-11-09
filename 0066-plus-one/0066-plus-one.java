class Solution {
    public int[] plusOne(int[] digits) {
        // TC - O(N) SC -  O(N)
        int carry = 1;
        int sum;
        for (int i = digits.length - 1; i >= 0; i--) {
            sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        // if all number inside array are 9
        // i.e. [ 9,9,9,9 ] than according to above loop it will become [ 0,0,0,0 ]
        // but we have to make it like this [ 9,9,9,9 ]-->[ 1,0,0,0,0 ]


        // to make like above we need to make new array of length--> n+1
        // by default new array values are set to -->0 only
        // thus just changed first value of array to 1 and return the array

        if(carry >0)
        {
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }
        return digits;
    }
}
