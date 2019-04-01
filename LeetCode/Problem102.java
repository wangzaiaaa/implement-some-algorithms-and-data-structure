/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Problem102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return answer;
        queue.offer(root);
        queue.offer(null);
        List<Integer> temp = new ArrayList<>();
        TreeNode tempNode = null;
        while(!queue.isEmpty()){
            tempNode = queue.poll();
            if(tempNode==null){
                answer.add(temp);
                if(queue.size()>0) queue.offer(null);
                temp = new ArrayList<>();
            }else{
                temp.add(tempNode.val);
                if(tempNode.left!=null) queue.offer(tempNode.left);
                if(tempNode.right!=null) queue.offer(tempNode.right);
                
            }
        }
        return answer;
        
    }
}