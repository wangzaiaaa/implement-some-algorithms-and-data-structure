class Solution {
    public boolean divisorGame(int N) {
        if(N==1) return false;
        if(N==2) return true;
        int [] ans = new int[N+1];
        ans[1] = 0;
        ans[2] = 1;
        ans[3] = 0;
        int flag = 0;
        for(int i=4;i<=N;i++){
            flag = 0;
            for(int j=1;j<Math.sqrt(i)+1;j++){
                if(i%j==0&&ans[i-j]==0){
                    flag = 1;
                    break;
                } 
            }
            ans[i] = flag;
        }
        return ans[N]==1;
    }
}