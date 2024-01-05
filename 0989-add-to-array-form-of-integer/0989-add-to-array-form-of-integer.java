class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int carry = 0;
        int i = num.length - 1; // Starting from the last index of the array
        List<Integer> result = new ArrayList<>(); // Creating a list to store the result
        
        while (i >= 0 || k > 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += num[i];
            }
            if (k > 0) {
                sum += k % 10;
                k /= 10;
            }
            result.add(0, sum % 10); // Adding the digit to the beginning of the list
            carry = sum / 10;
            i--;
        }
        
        return result;
    }
}
