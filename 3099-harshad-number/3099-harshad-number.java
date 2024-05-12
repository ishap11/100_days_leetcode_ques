class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int rem = x;
        int sum =0;

        while(rem > 0){
            sum += rem % 10;
            rem /= 10;
        }
        
        if(x % sum == 0){
            return sum;
        }
        return -1;
    }
}