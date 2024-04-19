class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];

        for(int i=0; i< n  ;i++){
            for(int j=0; j< m ; j++){
                if(grid[i][j] == '1' && visited[i][j] == 0){
                    drawTreeForComp(grid , i, j , visited);
                    count++;
                }
            }
        }
        return count;
    }


    public static void drawTreeForComp(char[][] grid , int i , int j, int[][] visited){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0' || visited[i][j] == 1){
        return;
    }

        visited[i][j] = 1;
        drawTreeForComp(grid , i-1 , j , visited); //north
        drawTreeForComp(grid , i , j+1, visited); //east
        drawTreeForComp(grid , i+1 , j , visited); //south
        drawTreeForComp(grid , i , j-1 , visited); //west
    }
}