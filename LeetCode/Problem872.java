/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Problem872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> li1 = new ArrayList<>();
        List<Integer> li2 = new ArrayList<>();
        addToList(root1,li1);
        addToList(root2,li2);
        if(li1.size()!=li2.size()) return false;
        boolean flag = true;
        for(int i=0;i<li1.size();i++){
            if(li1.get(i)!=li2.get(i)){
                flag = false;
                break;
            }
        }
        return flag;
        
        
    }
    public static void addToList(TreeNode root,List<Integer> li){
        if(root!=null){
            if(root.left==null&&root.right==null) li.add(root.val);
            addToList(root.left,li);
            addToList(root.right,li);
        }
    }
}