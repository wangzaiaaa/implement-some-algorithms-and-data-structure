/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// 0-48
class Solution {
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root,"");
    }
    public int sumNumbers(TreeNode root,String cur){
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return Integer.valueOf(cur+(char)(48+(root.val)));
        if(root.left==null) return sumNumbers(root.right,cur+(char)(root.val+48));
        if(root.right==null) return sumNumbers(root.left,cur+(char)(root.val+48));
        return sumNumbers(root.left,cur+(char)(root.val+48))+sumNumbers(root.right,cur+(char)(root.val+48));

    }
}