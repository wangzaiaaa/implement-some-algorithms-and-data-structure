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
    int max = 0;
    Map<Integer,Integer> map = new HashMap<>();
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        dfs(root,1,1);
        return max;
    }
    public void dfs(TreeNode node,int level,int index){
        if(node==null)return;
        if(!map.containsKey(level)){
            map.put(level,index);
        }
        max = Math.max(max,index-map.get(level)+1);
        dfs(node.left,level+1,2*index);
        dfs(node.right,level+1,2*index+1);
    }
}