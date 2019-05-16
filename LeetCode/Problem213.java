class Solution {
    public int rob(int[] nums) {
        if(nums==null||nums.length<1) return 0;
        if(nums.length==1) return nums[0];
        else if(nums.length==2) return Math.max(nums[0],nums[1]);
        else return Math.max(rob(nums,0,nums.length-2),rob(nums,1,nums.length-1));
    }
    public int rob(int [] nums,int low,int hi){
        if(low==hi) return nums[low];
        if(low==hi-1) return Math.max(nums[low],nums[hi]);
        int [] dp = new int [hi+1];
        dp[low] = nums[low];
        dp[low+1] = Math.max(nums[low],nums[low+1]);
        for(int i=low+2;i<=hi;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[hi];
    }
}