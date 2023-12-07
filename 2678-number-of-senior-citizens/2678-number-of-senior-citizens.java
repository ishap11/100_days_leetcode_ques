class Solution {
    public int countSeniors(String[] details) {
        // TC - O(n) SC - O(1)
        int count =0;
        for(int i=0 ; i< details.length; i++){
            String particular_details = details[i];

            if(((particular_details.charAt(11) - '0')*10) + (particular_details.charAt(12) -'0') >60){
                count++;
            }
        }
        return count;
    }
}