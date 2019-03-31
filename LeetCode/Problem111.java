/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Peoblem111 {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        else if(root.left==null&&root.right==null) return 1;
        else if(root.left==null) return minDepth(root.right)+1;
        else if(root.right==null) return minDepth(root.left)+1;
        else return Math.min(1+minDepth(root.left),1+minDepth(root.right));
    }
}