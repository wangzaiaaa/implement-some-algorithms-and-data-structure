class Problem961 {
    public int repeatedNTimes(int[] A) {
        if(A==null||A.length<1) return 0;
        Arrays.sort(A);
        int max = 0,sum = 1,index = 0;
        for(int i=1;i<A.length;i++){
           
            
            if(A[i]==A[i-1]) sum++;
            else{
                if(sum>max){
                    max = sum;
                    index = i-1;
                }
                sum = 1;
                
            }
            if(i==A.length-1&&sum>max){
                index = i-1;
            }
        }
        return A[index];
        }
}