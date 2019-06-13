class Solution {
    public int minSteps(int n) {
        if(n<=1) return 0;
        int res = 0;
        while(n!=1){
            for(int i=2;i<=n;i++){
                if(n % i==0){
                    res += i;
                    n /= i;
                    break;
                }
            }
        }
        return res;
    }
}