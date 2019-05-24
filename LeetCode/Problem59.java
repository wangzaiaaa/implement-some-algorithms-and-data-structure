class Solution {
    public int[][] generateMatrix(int n) {
        if(n<=0) return null;
        int [][] matrix = new int[n][n];
        int start = 0;
        int origin = 1;
        while(matrix.length>2*start&&matrix[0].length>2*start){
            origin = fillMatrix(matrix,start,origin);
            start++;
        }
        return matrix;
    }
    int fillMatrix(int [][] matrix,int start,int origin){
        int row = matrix.length;
        int column = matrix[0].length;
        int endX = row - start -1;
        int endY = column - start -1;
        for(int i=start;i<=endX;i++){
            matrix[start][i] = origin++;
        }
        if(endY>start){
            for(int i=start+1;i<=endX;i++){
                matrix[i][endY] = origin++;
            }
        }
        if(endX>start&&endY>start){
            for(int i=endY-1;i>=start;i--){
                matrix[endX][i] = origin++;
            }
        }
        if(endY>start&&endX-1>start){
            for(int i=endX-1;i>start;i--){
                matrix[i][start] = origin++;
            }
        }
        return origin;
    }
}