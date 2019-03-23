/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Problem515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> answer= new ArrayList<>();
        if(root==null) return answer;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        Integer temp = Integer.MIN_VALUE;
        TreeNode node = null;
        while(!queue.isEmpty()){
            node = queue.poll();
            if(node!=null){
                if(node.val>temp) temp = node.val;
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }else{
                answer.add(temp);
                temp = Integer.MIN_VALUE;
                if(queue.size()>=1){
                    queue.offer(null);
                }
            }
            
        }
        return answer;
    }
}