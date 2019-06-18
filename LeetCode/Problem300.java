class Solution {
    public int lengthOfLIS(int[] nums) {
        // if(nums==null||nums.length<1) return 0;
        // if(nums.length<2) return nums.length;
        // int [] dp = new int [nums.length];
        // Arrays.fill(dp,1);
        // for(int i=1;i<nums.length;i++){
        //     for(int j=0;j<i;j++){
        //         if(nums[i]>nums[j]){
        //             dp[i] = Math.max(dp[i],dp[j]+1);
        //         }
        //     }
        // }
        // int res = 0;
        // for(int i:dp){
        //     if(i>res) res = i;
        // }
        // return res;
        
        if(nums==null||nums.length<1) return 0;
        if(nums.length<2) return 1;
        int dp [] = new int [nums.length];
        int length = 0;
        for(int num:nums){
            int lo = 0,hi = length;
            while(lo<hi){
                int mid = lo + ((hi-lo)>>1);
                if(dp[mid]<num){
                    lo = mid + 1;
                }
                else{
                    hi = mid;
                }
              
            } 
            dp[lo] = num;
            if(lo==length) length++;
            
        }
        return length;
        
    }
}