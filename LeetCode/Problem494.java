class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        if(nums==null||nums.length<1) return 0;
        return findTargetSumWays(nums,S,0,0);
    }
    public int findTargetSumWays(int [] nums,int S,int layel,int cur){
        if(layel>=nums.length){
            return S==cur ? 1:0;
        }
        return findTargetSumWays(nums,S,layel+1,cur+nums[layel]) + findTargetSumWays(nums,S,layel+1,cur-nums[layel]);
    }
}