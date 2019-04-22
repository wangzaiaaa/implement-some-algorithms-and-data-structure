class Problem762 {
    public int countPrimeSetBits(int L, int R) {
        int ans = 0,count=0,temp=0;
        for(int i=L;i<=R;i++){
            temp = i;
            count=0;
            while(temp!=0){
                if(temp%2!=0){
                    count++;
                }
                temp>>=1;
            }
            if(count==2||count==3||count==5||count==7||count==11||count==13||count==17||count==19){
                ans++;
            }
        }
        return ans;
        
    }

}