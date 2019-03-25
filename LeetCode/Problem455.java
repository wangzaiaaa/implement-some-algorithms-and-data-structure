class Problem455 {
    public int findContentChildren(int[] g, int[] s) {
        if(g==null||s==null) return 0;
        else if(g.length<1||s.length<1) return 0;
        else{
            Arrays.sort(g);
            Arrays.sort(s);
            int i=0,j=0,answer=0;
            while(i<g.length&&j<s.length){
                if(g[i]<=s[j]){
                    i++;
                    j++;
                    answer++;
                }else{
                    j++;
                }
            }
            return answer;
        }
    }
}