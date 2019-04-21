/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Problem110 {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        boolean flag = Math.abs(height(root.left)-height(root.right))<=1;
        if(flag) return isBalanced(root.left)&&isBalanced(root.right);
        else return false;
    }
    public int height(TreeNode node){
        if(node==null) return 0;
        else if(node.left==null&&node.right==null) return 1;
        else return Math.max(height(node.left),height(node.right))+1;
    }
}