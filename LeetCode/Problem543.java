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
    int max = 0; 
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        deepth(root);
        return max;
    }
    public int deepth(TreeNode node){
        if(node==null) return 0;
        else{
            int left = deepth(node.left);
            int right = deepth(node.right);
            max = Math.max(left+right,max);
            return Math.max(left,right) + 1;
        }
    }
}