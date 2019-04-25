class Solution {
    public int numSquares(int n) {
        if(n<=3) return n;
        int [] ans = new int [n+1];
        ans[1] = 1;
        ans[2] = 2;
        ans[3] = 3;
        for(int i=4;i<=n;i++){
            ans[i] = i;
            for(int x=1;i-x*x>=0;x++){
                ans[i] = Math.min(ans[i],ans[i-x*x]+1);
            }
        }
        return ans[n];
    }
}