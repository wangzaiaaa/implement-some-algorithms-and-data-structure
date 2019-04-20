/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Problem98 {
    
    public double last =- Double.MAX_VALUE;
    public boolean isValidBST(TreeNode root) {
        return inorder(root);
        
    }
    public  boolean inorder(TreeNode root){
        if(root==null){
            return true;
        }
        if(inorder(root.left)){
            if(last<root.val){
                 last = root.val;
                 return inorder(root.right);
            }
            
        }
        return false;
        
    }
}