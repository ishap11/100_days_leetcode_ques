public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count =0;
        while(n!=0){
            int lastBit = n &1; //stores last bit of a  number n  (1&0)
            count = count + lastBit; //adds  last bit number in count
            n= n>>>1;
        }
        return count;
    }
}