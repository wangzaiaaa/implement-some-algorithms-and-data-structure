/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Problem222 {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        else return 1 + countNodes(root.left) + countNodes(root.right);
    }
}