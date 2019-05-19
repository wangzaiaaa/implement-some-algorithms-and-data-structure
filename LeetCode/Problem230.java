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
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return -1;
        int count = count(root.left);
        if(count==k-1){
            return root.val;
        }else if(count>k-1){
            return kthSmallest(root.left,k);
        }else{
            return kthSmallest(root.right,k-count-1);
        }
        
    }
    public int count(TreeNode root){
        if(root==null){
            return 0;
        }else{
            return 1 + count(root.left) + count(root.right);
        }
    }
}