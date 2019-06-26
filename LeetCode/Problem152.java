class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null||nums.length<1) return 0;
        int res = nums[0];
        int length = nums.length;
        int min_dp = nums[0];
        int max_dp = nums[0];
        for(int i=1;i<length;i++){
            int temp1 = min_dp,temp2 = max_dp;
            min_dp = min(nums[i],temp1*nums[i],temp2*nums[i]);
            max_dp = max(nums[i],temp1*nums[i],temp2*nums[i]);
            res = Math.max(res,max_dp);
        }
        return res;
        
    }
    int min(int x,int y,int z){
        int min = x;
        if(y<min) min = y;
        if(z<min) min = z;
        return min;
    }
    int max(int x,int y,int z){
        int max = x;
        if(y>max) max = y;
        if(z>max) max = z;
        return max;
    }
}