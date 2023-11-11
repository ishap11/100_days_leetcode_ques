class Solution {
    public void rotate(int[][] matrix) {
        // Time Complexity: O(N^2)  Space Complexity: O(1)
        // Transpose
        for(int i= 0 ; i< matrix.length ; i++){
            for(int j= i ; j< matrix[0].length ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // replace last by first-->second loop where  trying to replace the last element with the first element in each row
        for(int i=0 ; i< matrix.length ; i++){
            int li = 0;
            int ri = matrix[i].length-1 ; 

            while(li < ri){
                int temp = matrix[i][li];
                matrix[i][li] = matrix[i][ri];
                matrix[i][ri] =temp;
                li++;
                ri--;
            }
        }
    }
}