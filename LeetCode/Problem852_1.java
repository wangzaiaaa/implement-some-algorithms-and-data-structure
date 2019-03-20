class Problem852_1 {
    public int peakIndexInMountainArray(int[] A) {
        if(A==null||A.length<1) return 0;
        if(A[0]>A[1]) return 0;
        if(A[A.length-1]>A[A.length-2]) return A.length-1;
       
        int start = 0,end = A.length-1;
        while(start<=end){
            int mid = start + ((end-start)>>1);
            if(mid>=1&&mid<A.length-1){
                if(A[mid-1]<A[mid]&&A[mid]>A[mid+1]) return mid;
                if(A[mid-1]<A[mid]&&A[mid]<A[mid+1]) start = mid+1;
                if(A[mid-1]>A[mid]&&A[mid]>A[mid+1]) end = mid-1;
            }else if(mid==0){
                return mid;
            }else{
                return mid;
            }
        }
        return 0;
    }
}