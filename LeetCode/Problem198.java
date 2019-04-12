class Problem198 {
    public int rob(int[] nums) {
        if(nums==null||nums.length<1) return 0;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        int [] ans = new int[nums.length];
        ans[0]=nums[0];
        ans[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            ans[i] = Math.max(ans[i-1],ans[i-2]+nums[i]);
        }
        return ans[ans.length-1];
        
    }
}