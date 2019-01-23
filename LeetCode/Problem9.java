class Problem9 {
    public boolean isPalindrome(int x) {
        int y = x;
        int res = 0;
        if(x<0) return false;
        while(x!=0){
            int pop = x % 10;
            x = x / 10;
            res = res * 10 + pop;
        }
        return res == y ? true : false; 
    }
}