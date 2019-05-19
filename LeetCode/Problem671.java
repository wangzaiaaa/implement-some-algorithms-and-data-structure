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
    public int findSecondMinimumValue(TreeNode root) {
        return dfs(root,root.val);
    }
    int dfs(TreeNode node,int target){
        if(node==null) return -1;
        if(node.val>target) return node.val;
        int left = dfs(node.left,target);
        int right = dfs(node.right,target);
        if(left==-1&&right==-1) return -1;
        if(left==-1) return right;
        if(right==-1) return left;
        return Math.min(right,left);
    }
}