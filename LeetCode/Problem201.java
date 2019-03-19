class Problem201 {
    public int rangeBitwiseAnd(int m, int n) {
        return (m==n||m==0) ? m:(rangeBitwiseAnd(m>>1,n>>1)<<1);
    }
  
}