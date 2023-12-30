class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        int j= s.length()-1;
        while(i<=j){
             while(i<j && !((s.charAt(i)>='a'&& s.charAt(i)<='z')|| (s.charAt(i)>='A' && s.charAt(i)<='Z'))) i++;
            while(i<j && !((s.charAt(j)>='a'&& s.charAt(j)<='z')|| (s.charAt(j)>='A' && s.charAt(j)<='Z'))) j--;
            sb.setCharAt(i, s.charAt(j));
            sb.setCharAt(j, s.charAt(i));
            i++;
            j--;
        }
        return String.valueOf(sb); 
    }
}