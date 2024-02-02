class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        for(int i=1; i<= 9 ;i++){
            dfs(i,n ,result);
        }
        return result;
    }
    public static void dfs(int i, int n ,List<Integer> result){
        if(i>n) {
            return;
        }

        result.add(i);
        for(int j = 0; j <= 9; j++){
            dfs(10*i + j , n , result);
        }
    }
}