class Solution {
    public int subarraySum(int[] nums, int k) {
        // int length = nums.length;
        // int [][] dp = new int[length][length];
        // int res = 0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         if(i==j) dp[i][j] = nums[i];
        //         else dp[i][j] = dp[i][j-1] + nums[j];
        //         if(dp[i][j]==k) res++;
        //     }
        // }
        // return res;
        int res = 0,num = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            num += nums[i];
            if(num==k){
                res++;
            }
            if(map.containsKey(num-k)){
                res += map.get(num-k);
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return res;
    }
}