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
    public int findBottomLeftValue(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        int curDeepth = 1,MaxDeepth = findMaxDeepth(root);
        queue.offer(root);
        queue.offer(null);
        TreeNode temp = null,ans = null;
        while(!queue.isEmpty()){
            temp = queue.poll();
            if(temp!=null){
                if(temp.left!=null) queue.offer(temp.left);
                if(temp.right!=null) queue.offer(temp.right);
                if(curDeepth==MaxDeepth){
                    ans = temp;
                    break;
                }
            }else{
                if(queue.size()>0) queue.offer(null);
                curDeepth++;
            }
        }
        return ans.val;
    }
    public int findMaxDeepth(TreeNode root){
        if(root==null) return 0;
        return Math.max(findMaxDeepth(root.left),findMaxDeepth(root.right)) + 1;
    }
}