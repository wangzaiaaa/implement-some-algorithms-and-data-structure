class Solution {
    public int nthUglyNumber(int n) {
        int [] dp = new int [n];
        dp[0] = 1;
        int index2 = 0,index3 = 0,index5 = 0;
        for(int i=1;i<n;i++){
            int min = Math.min(2 * dp[index2],Math.min(3 * dp[index3],5 * dp[index5]));
            if(min == 2 * dp[index2]) index2++;
            if(min == 3 * dp[index3]) index3++;
            if(min == 5 * dp[index5]) index5++;
            dp[i] = min;
        }
        return dp[n-1];
    }
}