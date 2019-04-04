/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Problem637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> answer = new ArrayList<>();
        if(root==null) return answer;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        int count = 0;
        double avl = 0,sum=0;
        TreeNode temp = null;
        while(!queue.isEmpty()){
            temp = queue.poll();
            if(temp==null){
                avl = sum/count;
                answer.add(avl);
                if(queue.size()>0){
                    sum = 0;
                    count = 0;
                    queue.offer(null);
                }
            }else{
                count++;
                sum += temp.val;
                if(temp.left!=null) queue.offer(temp.left);
                if(temp.right!=null) queue.offer(temp.right);
            }
        }
        return answer;
    }
}