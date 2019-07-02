class Solution {
    public int findPaths(int m, int n, int N, int i, int j) {
        if(N<=0) return 0;
        int [][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
        int [][][] dp = new int[m][n][N+1];
        for(int k=1;k<=N;k++){
            for(int p=0;p<m;p++){
                for(int q=0;q<n;q++){
                    for(int [] dir : directions){
                        int n_p = p + dir[0];
                        int n_q = q + dir[1];
                        //一步出界
                        if(n_p<0||n_p>=m||n_q<0||n_q>=n){
                            dp[p][q][k]++;
                        }else{
                            dp[p][q][k] = (dp[p][q][k] + dp[n_p][n_q][k-1]) % 1000000007;
                        }
                    }
                }
            }
        }
        return dp[i][j][N];
        
    }
}