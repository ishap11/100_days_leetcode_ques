class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // TC - O(m*n) SC - O(1)
        
        List<Integer> result = new ArrayList<>(); 
        //using return inside the loop, which will
        // exit the method and return a value immediately. Instead, store the values in a list
        // and return the list after the loop.
        int m = matrix.length;
        int n = matrix[0].length;
        int minr = 0; //min row
        int minc = 0; //min column
        int maxr = matrix.length-1; //max row
        int maxc = matrix[0].length-1; // max column
        int tne = m*n; //tnc = total no. of element
        int count = 0;
        
        while(count < tne){
            // top wall
            for(int j = minc; j <= maxc && count < tne; j++){
                result.add(matrix[minr][j]);
                count++;
            }
            minr++;

            // right wall
            for(int i = minr  ; i<=maxr && count < tne ; i++){
                result.add(matrix[i][maxc]);
                count++;
            }
            maxc--;

            // bottom wall
            for(int j = maxc ; j>=minc && count < tne ; j--){
                result.add(matrix[maxr][j]);
                count++;
            }
            maxr--;

            // left wall
            for(int i = maxr ; i>=minr && count < tne ; i--){
                result.add(matrix[i][minc]);
                count++;
            }
            minc++;
        }
        return result;
    }
}