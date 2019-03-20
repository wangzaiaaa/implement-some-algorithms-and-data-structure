class Problem852 {
    public int peakIndexInMountainArray(int[] A) {
        if(A==null||A.length<1) return 0;
        if(A[0]>A[1]) return 0;
        if(A[A.length-1]>A[A.length-2]) return A.length-1;
        int index = 0;
        for(int i=1;i<A.length;i++){
            if(A[i]<A[i-1]){
                index = i-1;
                break;
            }
        }
        return index;
    }
}