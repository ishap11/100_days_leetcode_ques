class Solution {
    public String reversePrefix(String word, char ch) {
        
        int index = word.indexOf(ch); 
        if (index != -1) { 
            char[] chars = word.toCharArray();
            int i = 0, j = index;
            while (i < j) { 
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
            return new String(chars);
        }
        return word;
    }
}