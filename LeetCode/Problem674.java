class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums==null||nums.length<1) return 0;
        if(nums.length==1) return 1;
        int p1 = 0,p2 = 1,max = 1;
        while(p1<nums.length&&p2<nums.length){
            if(nums[p2]>nums[p2-1]){
                max = Math.max(max,p2-p1+1);
                p2++;
            }else{
                p1 = p2;
                p2 = p2+1;
            }
        }
        return max;
    }
}