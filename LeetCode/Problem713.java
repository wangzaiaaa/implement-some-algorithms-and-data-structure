class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(nums==null||nums.length<1||k<1) return 0;
        int l = 0,sum = 1,res = 0;
        for(int r=0;r<nums.length;r++){
            sum *= nums[r];
            while(sum>=k && l<=r){
                sum /= nums[l++];
            }
            res += r-l+1;
        }
        return res;
    }
}