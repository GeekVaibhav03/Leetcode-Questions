class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c != mat.length*mat[0].length){
            return mat;
        }
        int [][] ans = new int[r][c];
        int row = 0;
        int col = 0;
        for(int [] arr : mat){
            for(int num : arr){
                if(col == c){
                    row++;
                    col = 0;
                }
                ans[row][col] = num;
                col++;
            }
        }
       return ans;  
    }
}