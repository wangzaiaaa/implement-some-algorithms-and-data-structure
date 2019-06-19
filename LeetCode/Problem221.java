class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix==null||matrix.length<1) return 0;
        int [][] dp = new int[matrix.length+1][matrix[0].length+1];
        int max = 0;
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(matrix[i-1][j-1]=='1'){
                    dp[i][j] = min(dp[i-1][j-1],dp[i-1][j],dp[i][j-1]) + 1;
                    max = Math.max(max,dp[i][j]);
                }
            }
        }
        return max*max;
    }
    int min(int x,int y,int z){
        int min = x;
        if(y<min) min = y;
        if(z<min) min = z;
        return min;
    }
}