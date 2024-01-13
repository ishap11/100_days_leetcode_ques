class Solution {
    public boolean halvesAreAlike(String s) {
        // TC - O(N) SC - O(1)
        int count1 =0;
        int count2 =0;
        int st = s.length();
        for(int i=0; i< st/2; i++){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                    count1++;
                }
        }
        for(int j=st/2; j< st ; j++){
                if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u' || s.charAt(j) == 'A' || s.charAt(j) == 'E' || s.charAt(j) == 'I' || s.charAt(j) == 'O' || s.charAt(j) == 'U'){
                    count2++;
                }
        }
        
        return count1 == count2;
    }
}