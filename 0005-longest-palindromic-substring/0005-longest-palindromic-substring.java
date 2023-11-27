class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        // testing for odd length palindromes
        for(int ax = 0; ax < s.length() ; ax++){
            int orb =1;
            int len =1;

            while(ax-orb >=0 && ax + orb < s.length()){
                if(s.charAt(ax-orb) == s.charAt(ax+orb)){
                    orb++;
                    len+=2;
                }else{
                    break;
                }
            }
            if(len > res.length()){
                int si = ax - len/2;
                res = s.substring(si , si+len);
            }
        }

        // testing for even length palindromes
        for(int ax = 0; ax < s.length() ; ax++){
            int orb =1;
            int len =0;

            while(ax-orb+1 >=0 && ax + orb < s.length()){
                if(s.charAt(ax-orb+1) == s.charAt(ax+orb)){
                    orb++;
                    len+=2;
                }else{
                    break;
                }
            }
            if(len > res.length()){
                int si = ax -len/2 +1;
                res = s.substring(si , si+len);
            }
        } 
        return res;
    }
}