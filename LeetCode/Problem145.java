/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Problem145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> answer= new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null) return answer;
        stack.push(root);
        TreeNode temp = null;
        while(!stack.isEmpty()){
            temp = stack.pop();
            answer.add(temp.val);
            if(temp.left!=null)stack.push(temp.left);
            if(temp.right!=null)stack.push(temp.right);
        }
        Collections.reverse(answer);
        return answer;
    }
}