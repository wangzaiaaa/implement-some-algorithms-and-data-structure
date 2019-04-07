class Problem43 {
    public String multiply(String num1, String num2) {
        if(num1==null||num2==null||num1.length()<1||num2.length()<1)
            return "";
        if(num1.charAt(0)=='0'||num2.charAt(0)=='0') return "0";
        int i=num1.length(),j=num2.length();
        int [] ans =  new int[i+j];
        int cur = 0;
        for(int p = i-1;p>=0;p--){
            for(int q=j-1;q>=0;q--){
                cur = (num1.charAt(p)-'0') * (num2.charAt(q)-'0');
                cur += ans[p+q+1];
                ans[p+q] += cur/10;
                ans[p+q+1] =cur%10;
            }
        }
        StringBuilder sb = new StringBuilder();
        int z = 0;
        while(z<ans.length&&ans[z]==0){
            z++;
        }
        for(;z<ans.length;z++){
            sb.append(ans[z]);
        }
        return sb.toString();
      
        
        
    }
}