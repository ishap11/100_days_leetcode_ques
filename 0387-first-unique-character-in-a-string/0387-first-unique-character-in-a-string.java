class Solution {
    public int firstUniqChar(String s) {
        // BRUTE FORCE APPROACH
        // TC - O(n^2) SC - O(1)

        // int len = s.length();
        // for(int i=0 ; i< len; i++){
        //     boolean flag = true;
        //     for(int j=0 ; j< len ; j++){
        //         if (i != j && s.charAt(i) == s.charAt(j)) {
        //             flag = false;
        //             break;
        //         }
        //     }
        //     if(flag == true)
        //     {
        //         return i;
        //     }
 
        // }
        // return -1;  // Return -1 if no unique character is found


        // BETTER Approach using HashMap
        // TC - O(n) SC - O(n)

//         Map<Character, Integer> charFreq = new HashMap<>();

//         // Update the map with character frequencies
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             charFreq.put(ch, charFreq.getOrDefault(ch, 0) + 1);
//         }

//         // Find the index of the first unique character
//         for (int i = 0; i < s.length(); i++) {
//             if (charFreq.get(s.charAt(i)) == 1) {
//                 return i;
//             }
//         }
        
//         return -1; // Return -1 if no unique character is found

        
        
//         EFFICIENT APPROACH
//        TC-O(N) SC -O(1)
        
        int[] freq = new int[26];
        char[] chars = s.toCharArray();
        for(char c :chars){
            freq[c-'a']++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (freq[chars[i] - 'a'] == 1) {
                return i;
            } 
        }
        return -1;
    }
}

