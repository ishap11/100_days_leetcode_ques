class Solution {
    public String reverseWords(String s) {
       
       //extra spaces remove hui or vo array me convert hogya
       String[] words = s.trim().split(" "); 

       StringBuilder sb  =new StringBuilder();
       for(int i= words.length -1; i>=0; i--){
           if(words[i].trim().isEmpty() == false){
               sb.append(words[i]);
               sb.append(" ");
           }
       }
       return sb.toString().trim();
    }
}