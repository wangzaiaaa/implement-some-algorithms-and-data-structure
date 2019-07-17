/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null&&t2==null) {
            return null;
        }else if(t1!=null&&t2==null){
            TreeNode node = new TreeNode(t1.val);
            node.left = mergeTrees(t1.left,null);
            node.right = mergeTrees(t1.right,null);
            return node;
        }else if(t1==null&&t2!=null){
            TreeNode node = new TreeNode(t2.val);
            node.left = mergeTrees(t2.left,null);
            node.right = mergeTrees(t2.right,null);
            return node;
        }else{
            TreeNode node = new TreeNode(t2.val+t1.val);
            node.left = mergeTrees(t2.left,t1.left);
            node.right = mergeTrees(t2.right,t1.right);
            return node;
        }
    }
}