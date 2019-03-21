class Problem204 {
    public int countPrimes(int n) {
        if(n<2) return 0;
        int [] answer = new int [n];
        for(int i=2;i<n;i++){
            answer[i] = i;
        }
        int z = 2;
        for(int j=2;j<(int)(n/2+1);j++){
            while(z*j<n){
                answer[z*j] = 0;
                z++;
            }
            z = 2;
        }
        int sum = 0;
        for(int p=2;p<n;p++){
            if(answer[p]!=0) sum++;
        }
        return sum;
        
    }
}