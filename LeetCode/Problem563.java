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
    public int findTilt(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null)) return 0;
        int result = 0;
        int val1 = root.left==null ? 0 : sum(root.left);
        int val2 = root.right==null ? 0 : sum(root.right);
        result = Math.abs(val1 - val2);
        result = result + findTilt(root.left) + findTilt(root.right);
        return result;
    }
    public int sum(TreeNode node){
        if(node==null) return 0;
        return node.val + sum(node.left) + sum(node.right);
    }
}