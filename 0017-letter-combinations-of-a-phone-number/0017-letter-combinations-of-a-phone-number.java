class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<>();
        }
        return getLetterCombinations(digits , 0);
    } 
    String[]codes = {"" ,"" , "abc" ,"def" , "ghi" , "jkl" ,"mno" , "pqrs" , "tuv" , "wxyz"};

    // 234 => 27 results a[34] b[34] c[34]
    // 34 => dg , dh, di , eg, eh , ei, fg, fh , fi
    // 2=> abc
    public List<String> getLetterCombinations(String digits , int idx){
        if(idx == digits.length()){
            List<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        List<String> myResult = new ArrayList<>();

        List<String> recResult = getLetterCombinations(digits, idx+1);
        char ch = digits.charAt(idx); //2 != '2', 2 == '2' -'0'
        String code = codes[ch - '0']; //abc

        for(String recString : recResult){ //dg , dh, di , eg, eh , ei, fg, fh , fi 
            for(int i=0 ; i< code.length() ; i++){ // a , b ,c
                char chcode = code.charAt(i);
                myResult.add(chcode + recString);
            }
        }
        return myResult;
    }
}