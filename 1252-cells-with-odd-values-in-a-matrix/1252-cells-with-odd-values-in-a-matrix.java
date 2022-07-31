class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int [][] ans = new int[m][n];
        for(int row=0; row<indices.length; row++){
            int r = indices[row][0];
            int c = indices[row][1];
            for(int i=0; i<m; i++){
                ans[i][c] +=1;
            }
            for(int j=0; j<n; j++){
                ans[r][j] +=1;
            }
        }
        int count = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(ans[i][j] %2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}