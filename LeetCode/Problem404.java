/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Problem404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int answer = 0;
        TreeNode roottemp,lefttemp;
        while(!queue.isEmpty()){
            roottemp = queue.poll();
            if(roottemp.left!=null){
                lefttemp=roottemp.left;
                if(lefttemp.left==null&&lefttemp.right==null) answer +=lefttemp.val;
                queue.offer(lefttemp);
            }
            if(roottemp.right!=null){
                queue.offer(roottemp.right);
            }
                
        }
        return answer;
        
    }
}