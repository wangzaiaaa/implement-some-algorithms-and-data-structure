class Solution {
    public int countSubstrings(String s) {
        if(s == null || s.length() < 1) return 0;
        String rev_s = new StringBuilder(s).reverse().toString();
        int length = s.length();
        int res = length;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(s.substring(i,j+1).equals(rev_s.substring(length-j-1,length-i))){
                    res++;
                }
            }
        }
        return res;
        
    }
}