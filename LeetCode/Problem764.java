class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost==null||cost.length<1) return 0;
        int [] dp = new int [cost.length+1];
        dp[0] = dp[1] = 0;
        for(int i=2;i<dp.length;i++){
            dp[i] = Math.min(dp[i-2]+cost[i-2],dp[i-1]+cost[i-1]);
        }
        return dp[dp.length-1];
    }
}