class Problem292 {
    public boolean canWinNim(int n) {
       return n%4!=0;
    }
}
//我的垃圾方法
class Solution {
    public boolean canWinNim(int n) {
        if(n<=3) return true;
        if(n==4) return false;
        boolean [] flags = new boolean [n+1];
        for(int i=1;i<=3;i++) flags[i]=true;
        flags[4] = false;
        for(int i=5;i<=n;i++){
            if(flags[i-1]==false||flags[i-2]==false||flags[i-3]==false) flags[i]=true;
            else flags[i] = false;
        }
        return flags[n];
    }
}