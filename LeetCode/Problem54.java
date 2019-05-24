class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList();
        if(matrix==null||matrix.length<1||matrix[0].length<1) return res;
        int start = 0;
        while(matrix.length>2*start&&matrix[0].length>2*start){
            MatrixInCircle(matrix,start,res);
            start++;
        }
        return res;
    }
    void MatrixInCircle(int [][] matrix,int start,List<Integer> res){
        int row = matrix.length;
        int column = matrix[0].length;
        int endX = row - start -1;
        int endY = column - start -1;
        for(int i=start;i<=endY;i++){
            res.add(matrix[start][i]);
        }
        if(endX>start){
            for(int i=start+1;i<=endX;i++){
                res.add(matrix[i][endY]);
            }
        }
        if(endX>start&&endY>start){
            for(int i=endY-1;i>=start;i--){
                res.add(matrix[endX][i]);
            }
        }
        if(endY>start&&endX-1>start){
            for(int i=endX-1;i>start;i--){
                res.add(matrix[i][start]);
            }
        }
    }
}