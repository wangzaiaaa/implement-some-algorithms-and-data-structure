class Problem905 {
    public int[] sortArrayByParity(int[] A) {
        if(A==null||A.length<1) return A;
        int index = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0&&(i!=index)) swap(A,i,index++);
            if(A[i]%2==0&&(i==index)) index++;
            
        }
        return A;
    }
    public static void swap(int [] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}