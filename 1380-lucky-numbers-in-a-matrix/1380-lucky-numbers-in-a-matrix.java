class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int row = matrix.length;
        int col = matrix[0].length;
        int [] minimumRow = new int[row];
        int minimumNo = matrix[0][0];
        for(int i=0; i<row; i++){
            minimumNo = matrix[i][0];
            for(int j=1; j<matrix[i].length; j++){
                minimumNo = Math.min(minimumNo , matrix[i][j]);
            }
            minimumRow[i] = minimumNo;
        }
        for(int j = 0; j<col; j++){
            int colMax = matrix[0][j];
            for(int i=0; i<row; i++){
                colMax = Math.max(colMax, matrix[i][j]);
            }
            for(int p : minimumRow){
                if(colMax == p){
                    ans.add(colMax);
                }
            }
        }
        return ans;
    }
}