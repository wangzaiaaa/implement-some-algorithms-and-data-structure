class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix==null||matrix.length<1||matrix[0].length<1){
            return;
        }else{
            int [][] visited = new int[matrix.length][matrix[0].length];
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    setZero(matrix,visited,i,j);
                }
            }
        }
    }
    public void setZero(int[][] matrix,int[][] visited,int row,int column){
        if(visited[row][column]==1||row<0||row>=matrix.length||column<0||column>=matrix[0].length){
            return;
        }else{
            if(matrix[row][column]==0){
                visited[row][column] = 1;
                for(int i=row-1;i>=0;i--){
                    if(matrix[i][column]!=0){
                        visited[i][column] = 1;
                    }
                    matrix[i][column] = 0;
                    
                }
                for(int i=row+1;i<matrix.length;i++){
                    if(matrix[i][column]!=0){
                        visited[i][column] = 1;
                    }
                    matrix[i][column] = 0;
                                      
                }
                for(int i=column-1;i>=0;i--){
                    if(matrix[row][i] !=0){
                        visited[row][i] = 1;    
                    }
                    matrix[row][i] = 0;
                    
                }
                for(int i=column+1;i<matrix[0].length;i++){
                    if(matrix[row][i] !=0){
                        visited[row][i] = 1;    
                    }
                    matrix[row][i] = 0;
                    
                }
                
            }
            
        }
    }
}