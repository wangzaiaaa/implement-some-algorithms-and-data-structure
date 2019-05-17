class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle==null||triangle.size()<1) return 0;
        int [][] dp = new int [triangle.size()+1][triangle.size()+1];
        for(int i=triangle.size()-1;i>=0;i--){
            List<Integer> temp = triangle.get(i);
            for(int j=0;j<temp.size();j++){
                dp[i][j] = Math.min(dp[i+1][j+1],dp[i+1][j]) + temp.get(j);
            }
        }
        return dp[0][0];
   
    }
}