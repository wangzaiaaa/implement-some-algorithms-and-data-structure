class Problem832 {
    public int[][] flipAndInvertImage(int[][] A) {
        if(A==null) return null;
        for(int i=0;i<A.length;i++){
            if(A[i]!=null){
                int [] temp = new int [A[i].length];
                for(int j=0;j<temp.length;j++){
                    temp[j] = A[i][A[i].length-1-j];
                }
                A[i] = temp;
            }
        }
        for(int i=0;i<A.length;i++){
            if(A[i]!=null){
                for(int j=0;j<A[i].length;j++){
                    A[i][j] ^=1;
                }
            }
        }
        return A;
    }
}