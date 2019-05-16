class Solution {
    public int[] dailyTemperatures(int[] T) {
        if(T==null||T.length<1) return null;
        int [] ans = new int [T.length];
        int start = 0,lastEnd = 0;
        for(int i=0;i<T.length;i++){
            if(i>=1&&T[i]>T[i-1]){
                start = lastEnd + 1;
            }else{
                start = i + 1;
            }
            for(int j=start;j<T.length;j++){
                if(T[j]>T[i]){
                    ans[i] = j-i;
                    lastEnd = j;
                    break;
                }
            }
        }
        return ans;
    }
}