class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0; i<4; i++){
            if(check(mat,target)){
                return true;
            }
            rotate(mat);
        }
        return false;
    }
    public boolean check(int [][] mat, int[][] target){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public int [][] rotate(int[][] mat){
        for(int i=0;i<mat.length;i++){
        for(int j=i;j<mat[i].length;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
                  
              }
          }
//   Reversing the Each Row of Matrix

    for(int i=0;i<mat.length;i++){
        int start=0;
        int end=mat[i].length-1;
        while(start<end){
            int temp=mat[i][start];
            mat[i][start]=mat[i][end];
            mat[i][end]=temp;
            start++;
            end--;
        }
    }

      
      return mat;
    }
}