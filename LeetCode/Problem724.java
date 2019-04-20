class problem724 {
    public int pivotIndex(int[] nums) {
        if(nums==null||nums.length<3) return -1;
        int ans = -1,sum = 0,cur=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(i>=1) cur += nums[i-1];
            if(cur==sum-cur-nums[i]){
                ans = i;
                break;
            }
        }
        return ans;
        
    }
}