class Problem136 {
    public int singleNumber(int[] nums) {
        if(nums==null||nums.length<1) return 0;
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            ans ^= nums[i];
        }
        return ans;
    }
}