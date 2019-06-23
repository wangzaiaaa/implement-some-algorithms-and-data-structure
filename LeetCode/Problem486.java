class Solution {
    public boolean PredictTheWinner(int[] nums) {
        if(nums==null||nums.length%2==0) return true;
        int length = nums.length;
        //dp[i][j] 表示先比后手获得的多的分数
        int [][] dp = new int [length][length];
        //dp的初始化
        for(int i=0;i<length;i++){
            dp[i][i] = nums[i];
        }
        for(int len=1;len<length;len++){
            for(int l=0,r=len;r<length;l++,r++){
            //当先手拿num[l](左侧),后手拿的最好值为dp[l+1][r]
			//当先手拿num[r](右侧),后手拿的最好值为dp[l][r-1]
			dp[l][r] = Math.max(nums[l] - dp[l + 1][r], nums[r] - dp[l][r - 1]);

            }
        }
        return dp[0][length-1] >= 0;
    }
}