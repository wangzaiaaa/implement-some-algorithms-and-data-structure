/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Problem113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curli = new ArrayList<>();
        addToList(ans,root,sum,curli,0);
        return ans;
    
    }
    public static void addToList(List<List<Integer>> ans,TreeNode node ,int sum,List<Integer> curli,int cur){
        if(node==null) return;
        if(cur+node.val==sum&&node.left==null&&node.right==null){
            curli.add(node.val);
            ans.add(curli);
            return;
        }
        else {
            curli.add(node.val);
            cur += node.val;
            List<Integer> newli1 = new ArrayList<>(curli);
            List<Integer> newli2 = new ArrayList<>(curli);
            addToList(ans,node.left,sum,newli1,cur);
            addToList(ans,node.right,sum,newli2,cur);
        }
       
    }
}