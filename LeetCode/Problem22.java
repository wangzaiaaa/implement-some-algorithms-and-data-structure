class Problem22 {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        addToList(answer,0,0,n,"");
        return answer;
                         
        
        
    }
    public static void addToList(List<String> ans,int l,int r,int max,String cur){
        if(cur.length()==max*2){
            ans.add(cur);
            return;
        }
        if(l<max){
            addToList(ans,l+1,r,max,cur+'(');
        }
        if(r<l){
            addToList(ans,l,r+1,max,cur+')');
        }
    }
}