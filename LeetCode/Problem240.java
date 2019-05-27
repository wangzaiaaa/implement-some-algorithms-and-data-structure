class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length<1||matrix[0].length<1) {
            return false;
        }else{
            return search(matrix,target,0,matrix[0].length-1);
        }
    }
    public boolean search(int [][] matrix,int target,int row,int column){
        if(row<0||row>=matrix.length||column<0||column>=matrix[0].length){
            return false;
        }else{
            if(matrix[row][column]==target){
                return true;
            }else if(matrix[row][column]<target){
                return search(matrix,target,row+1,column);
            }else{
                return search(matrix,target,row,column-1);
            }
        }
    }
}