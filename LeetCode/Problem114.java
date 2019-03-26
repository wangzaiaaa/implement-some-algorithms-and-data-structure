/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Problem114 {
    public void flatten(TreeNode root) {
        if(root==null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode answer = root,temp=null;
        if(root.right!=null) stack.push(root.right);
        if(root.left!=null) stack.push(root.left);
        while(!stack.isEmpty()){
            temp = stack.pop();
            if(temp.right!=null) stack.push(temp.right);
            if(temp.left!=null) stack.push(temp.left);
            root.right = temp;
            root.left=null;
            root = root.right;
        }
        root = answer;
        
    }
}