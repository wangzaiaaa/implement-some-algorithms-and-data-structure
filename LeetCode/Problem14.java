class Problem14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length<1) return "";
        for(int i=0;i<strs.length;i++){
            if(strs[i]==null||strs.equals("")) return "";
        }
        int minlength = strs[0].length();
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()<minlength) minlength = strs[i].length();
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<minlength;i++){
            boolean contains = true;
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=strs[j-1].charAt(i)) contains = false;
            }
            if(contains==false) break;
            sb.append(strs[0].charAt(i));
        }
        return sb.toString() ;       
    }
}