class Problem461 {
    public int hammingDistance(int x, int y) {
        String num = Integer.toBinaryString(x^y);
        int count = 0;
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='1') count++;
        }
        return count;
    }
}