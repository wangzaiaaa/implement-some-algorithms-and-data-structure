class Problem342 {
    public boolean isPowerOfFour(int num) {
        if(num<0) return false;
        while(num>=4){
            if(num%4!=0) return false;
            num = (num>>2);
        }
        return num==1;
    }
}