class Solution {
    // static boolean isVowel(char c) {
    //     // TC-O(n) SC -O(1)
    //     return (c == 'a' || c == 'A' || c == 'e'
    //             || c == 'E' || c == 'i' || c == 'I'
    //             || c == 'o' || c == 'O' || c == 'u'
    //             || c == 'U');
    // }
    public String reverseVowels(String s) {
        
        char[] arr = s.toCharArray();
        int li=0;
        int ri= arr.length-1;

        while(li<ri){
            if(isVowel(arr[li]) && isVowel(arr[ri])){
                char temp = arr[li];
                arr[li] = arr[ri];
                arr[ri] = temp;
                li++;
                ri--;
            }else if(isVowel(arr[li])){
                ri--;
            }else if(isVowel(arr[ri])){
                li++;
            }else{
                li++;
                ri--;
            }
        }
        return new String(arr);
        /*
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
        */
    }

    boolean isVowel(char ch){
        if(ch == 'a' || ch =='A') return true;
        else if(ch == 'e' || ch =='E') return true;
        else if(ch == 'i' || ch =='I') return true;
        else if(ch == 'o' || ch =='O') return true;
        else if(ch == 'u' || ch =='U') return true;
        else return false;
    }
}