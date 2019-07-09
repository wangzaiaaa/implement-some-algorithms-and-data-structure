class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s==null || wordDict==null || wordDict.size() < 1 || s.length() < 1) return false;
        int length = s.length();
        Map<String,Integer> map = new HashMap<>();
        for(String str : wordDict){
            map.put(str,1);
        }
        boolean [] dp = new boolean [length + 1];
        dp[0] = true;
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<i;j++){
                if(dp[j] && map.containsKey(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[length];
        
    }
}