class Solution {
    public String mergeAlternately(String word1, String word2) {
        // TC - O(n) SC - O(n)
        StringBuilder sb = new StringBuilder();

        int i=0; 
        int j=0;
        boolean flag  = true;
        while(i < word1.length() && j < word2.length()){
            if(flag) {
                sb.append(word1.charAt(i));
                i++;
            }else{
                sb.append(word2.charAt(j));
                j++;
            }
            flag = !flag;
        }
        while(i < word1.length()){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j < word2.length()){
            sb.append(word2.charAt(j));
            j++;
        }
        return sb.toString();
    }
}
// if flag true toh string word1 ki flag false string word2 ki