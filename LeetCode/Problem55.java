class Solution {
    public boolean canJump(int[] nums) {
        if(nums==null||nums.length<1) return false;
        if(nums.length==1) return true;
        boolean [] dp = new boolean[nums.length];
        dp[0] = true;
        boolean isOk = false,canJump = false;;
        for(int i=0;i<=nums.length-1;i++){
            if(isOk){
                canJump = true;
                break;
            }
            if(dp[i]){
                for(int j=i+1;j<=i+nums[i]&&j<nums.length;j++){
                    dp[j] = true;
                    if(dp[nums.length-1]){
                        isOk = true;
                        break;
                    }
                }
            }
        }
        return canJump;
        
        
    }
}