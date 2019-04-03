/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Problem100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        else if((p!=null&&q==null)||(p==null&&q!=null)) return false;
        else{
            if(p.val!=q.val) return false;
            return isSameTree(p.left,q.left)&&isSameTree(q.right,p.right);
        }
    }
}