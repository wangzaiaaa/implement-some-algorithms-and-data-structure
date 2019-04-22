public class Problem191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;
        for(int i=0;i<32;i++){
            ans += (n>>i)&1;
        }
        return ans;
    }
}