class Solution {
    static boolean isVowel(char c) {
        // TC-O(n) SC -O(1)
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    }
    public String reverseVowels(String s) {
        
        int i=0;
        int j= s.length()-1;
        char[] str = s.toCharArray();

        while(i<j){
            if(!isVowel(str[i])){
                i++;
            }else if(!isVowel(str[j])){
                j--;
            }else{
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }
        }
        String str1 = String.copyValueOf(str);
        return str1;
    }
}