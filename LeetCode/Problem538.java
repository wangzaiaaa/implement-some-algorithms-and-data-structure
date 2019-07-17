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
    public TreeNode convertBST(TreeNode root) {
        TreeNode clone = cloneTreeNode(root);
        return convertBST(clone,root);
    }
    void add(TreeNode cur,TreeNode node,int val){
        if(cur==null || node==null) return;
        if(node.val>val) cur.val += node.val;
        add(cur,node.left,val);
        add(cur,node.right,val);
    }
    public TreeNode convertBST(TreeNode node1,TreeNode root) {
        if(node1==null) return null;
        TreeNode node = node1;
        add(node,root,node.val);
        node.left = convertBST(node1.left,root);
        node.right = convertBST(node1.right,root);
        return node;
    }
    public TreeNode cloneTreeNode(TreeNode root){
        if(root==null) return null;
        TreeNode node = new TreeNode(root.val);
        node.left =cloneTreeNode(root.left);
        node.right = cloneTreeNode(root.right);
        return node;
    }
}