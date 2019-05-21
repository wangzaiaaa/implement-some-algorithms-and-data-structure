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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        queue.offer(null);
        int size = 1;
        TreeNode temp = root,lastNode = null;
        while(!queue.isEmpty()){
            lastNode = temp;
            temp = queue.poll();
            if(temp!=null){
                if(temp.left!=null) queue.offer(temp.left);
                if(temp.right!=null) queue.offer(temp.right);
            }else{
                if(queue.size()>0){
                    queue.offer(null);
                }
                ans.add(lastNode.val);
            }
        }
        return ans;
    }
        

}