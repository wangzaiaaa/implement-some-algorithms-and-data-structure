class Solution {
    private List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        if(n<=0||k<=0||k>n){
            return res;
        }else{
            dfs(n,1,k,1);
            return res;
        }
    }
    
    private ArrayList<Integer> list = new ArrayList<>();
    private void dfs(int n,int level,int k,int start){
        if(level>k){
            res.add((ArrayList<Integer>)list.clone());
            return;
        }
        for(int i=start;i<=n-(k-level);i++){
            list.add(i);
            dfs(n,level+1,k,i+1);
            list.remove(list.size()-1);
        }
    }
}