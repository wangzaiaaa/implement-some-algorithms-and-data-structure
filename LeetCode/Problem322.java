class Solution {
    public int coinChange(int[] coins, int amount) {
       if(coins==null||coins.length<1||amount<0) return -1;
       if(amount==0) return 0;
       int [] dp = new int[amount+1];
       for(int i=1;i<=amount;i++){
           dp[i] = Integer.MAX_VALUE;
           boolean flag = false;
            for(int coin:coins){
               if(i-coin>=0&&dp[i-coin]!=-1){
                   dp[i] = Math.min(dp[i],dp[i-coin] + 1);
                   flag = true;
               }
           }
           if(!flag) dp[i] = -1;
       }
       return dp[amount]==0 ? -1 : dp[amount];
    }
    
}