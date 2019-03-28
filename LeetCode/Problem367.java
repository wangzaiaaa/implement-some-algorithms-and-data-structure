class Problem367 {
    public boolean isPerfectSquare(int num) {
        if(num<0) return false; 
        if(num==0||num==1) return true;
        int low=0,high=num;
        while(high>=low){
            int mid = (low + ((high-low)>>1));
            if(mid==num*1.0/mid) return true;
            else if(mid>num*1.0/mid) high = mid-1;
            else low = mid + 1;
        }
        return false;
    }
}