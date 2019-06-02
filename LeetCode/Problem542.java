class Solution {
    public int[][] updateMatrix(int[][] matrix) {
         if(matrix==null) return null;
        
        int row = matrix.length,col = matrix[0].length;
        if(row<1||col<1) return matrix;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==1){
                    matrix[i][j] = row + col;
                }
                if(i>0){
                        matrix[i][j] = Math.min(matrix[i][j],matrix[i-1][j]+1);
                }
                if(j>0){
                        matrix[i][j] = Math.min(matrix[i][j],matrix[i][j-1]+1);
                }
            }
        }
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
               if(i<row-1){
                    matrix[i][j] = Math.min(matrix[i][j],matrix[i+1][j]+1);
                }
                if(j<col-1){
                    matrix[i][j] = Math.min(matrix[i][j],matrix[i][j+1]+1);
                }
                
            }
        }
        return matrix;
    }
}