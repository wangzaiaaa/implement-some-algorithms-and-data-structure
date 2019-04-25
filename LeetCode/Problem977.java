class Problem977 {
    public int[] sortedSquares(int[] A) {
        return newSolution(A);
    }
    public int[] newSolution(int [] A){
        if(A==null) return null;
        int l = 0;
        while(l<A.length&&A[l]<0){
            l++;
        }
        int r = l;
        l = l-1;
        int [] ans = new int [A.length];
        int temp1=0,temp2=0,index=0;
        while(l>=0||r<A.length){
            temp1 = l<0 ? 0 : A[l]*A[l];
            temp2 = r>=A.length? 0 : A[r]*A[r];
            if(l<0){
                ans[index++] = temp2;
                r++;
            }else if(r>=A.length){
                ans[index++] = temp1;
                l--;
            }else if(temp1<temp2){
                ans[index++] = temp1;
                l--;
            }else{
                ans[index++] = temp2;
                r++;
            }
            
        }
        return ans;
        
         
    }
}