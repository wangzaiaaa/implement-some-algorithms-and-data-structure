class Problem343 {
    public int integerBreak(int n) {
        if(n<=1) return n;
        int [] dp = new int [n+1];
        dp[1]=dp[2]=1;
        int temp = 0;
        for(int i=3;i<=n;i++){
            for(int j=1;j<(int)(i/2)+1;j++){
                temp = Math.max(dp[j],j)*Math.max(dp[i-j],i-j);
                if(temp>dp[i]) dp[i] = temp;
            }
        }
        return dp[n];
        
    }
}