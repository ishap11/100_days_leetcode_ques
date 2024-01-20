class Solution {

    
    // BRUTE FORCE - TC - O(n*n*r) SC - O(n^3)
    public static int nCr(int n, int r) {
        long res = 1;
        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> ans = new ArrayList<>();
         for (int row = 1; row <= numRows; row++) {
            List<Integer> tempLst = new ArrayList<>(); // temporary list
            for (int col = 1; col <= row; col++) {
                tempLst.add(nCr(row - 1, col - 1));
            }
            ans.add(tempLst);
        }
        return ans;
    }
    

    // OTIMISED APPROACH - TC - O(n*n) SC - O(1)

//     public List<List<Integer>> generstingRows(int row){
//         long ans = 1;
//         List<Integer> ansRow = new ArrayList<>();
//         ansRow.add(1); //inserting the 1st element

//         //calculating the rest of the elements:
//         for (int col = 1; col < row; col++) {
//             ans = ans * (row - col);
//             ans = ans / col;
//             ansRow.add((int)ans);
//         }
//         return ansRow;
//     }
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> ans = new ArrayList<>();

//         // storing pascal Triangle
//         for(int i=0 ; i< numRows ; i++){
//             ans.add(generatingRows(row));
//         }
//         return ans;
//     }

}