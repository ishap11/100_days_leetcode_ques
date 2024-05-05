class Solution {
    public char findTheDifference(String s, String t) {
        char sarr[] = s.toCharArray();
        char tarr[] = t.toCharArray();

        int ssum = 0;
        int tsum =0;
        for(int i=0; i< tarr.length ; i++){
            tsum += tarr[i];
        }
        for(int i=0; i< sarr.length ; i++){
            ssum += sarr[i];
        }
        return (char)(tsum - ssum);
    }
}