class Solution {
    public boolean isPalindrome(String s) {
        // if (s.isEmpty()) {
        // 	return true;
        // }
        // int low = 0;
        // int high = s.length()-1;
        // // Lowercase string 
        // s = s.toLowerCase();

        // // Compares character until they are equal 
        // while(low <= high){
        //     char getAtlow = s.charAt(low);
        //     char getAthigh = s.charAt(high);

        //     // If there is another symbol in left 
        //     // of sentence 
        //     if(!(getAtlow >= 'a' && getAtlow <= 'z')){
        //         low++;
        //     }
        //      // If there is another symbol in right  
        //     // of sentence 
        //     else if(!(getAthigh >= 'a' && getAthigh <= 'z')){
        //         high--;
        //     }
              
        //     // If characters are equal
        //     else if(getAtlow == getAthigh){
        //         low++;
        //         high--;
        //     // If characters are not equal then 
        //     // sentence is not palindrome
        //     }else{
        //         return false;
        //     }
           
        // }
        // // Returns true if sentence is palindrom
        // return true;

        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for( int i = 0 ; i < s.length() ; i++){
            if(Character.isDigit(s.charAt(i)) ||
               Character.isLetter(s.charAt(i))  ){
                sb.append(s.charAt(i));
            }
        }
        int n = sb.length()-1;
        for(int i=0 ; i< sb.length()/2; i++){
            if(sb.charAt(i) != sb.charAt(n-i)) return false;
        }
        return true;
    }
}