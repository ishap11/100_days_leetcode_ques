class Solution {
    public String defangIPaddr(String address) {
        // String res = "";
        // for(int i=0; i < address.length() ; i++){
        //     if(address.charAt(i) == '.'){
        //         res = res+"[.]";
        //     }else{
        //         res = res + address.charAt(i);
        //     }
        // }
        // return res;

        // Another approach
        String j= address.replace(".","[.]");
        return j;
    }
}