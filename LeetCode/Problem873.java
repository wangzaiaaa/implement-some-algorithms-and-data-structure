class Solution {
    public int lenLongestFibSubseq(int[] A) {
        if(A == null || A.length < 1) return 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<A.length;i++){
            set.add(A[i]);
        }
        int res = 0;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                int x  = A[j],y = A[i] + A[j];
                int len = 2;
                while(set.contains(y)){
                    int temp = y;
                    y += x;
                    x = temp;
                    res = Math.max(res,++len);
                }
           
            }
        }
        return res>=3 ? res : 0;
    }
}