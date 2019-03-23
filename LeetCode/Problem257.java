/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Problem257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<>();
        if(root==null) return answer;
        addToList(root,answer,"");
        return answer;
    }
    public static void addToList(TreeNode node,List<String> list,String cur){
        if(node.right!=null&&node.left!=null){
            addToList(node.right,list,cur+String.valueOf(node.val)+"->");
            addToList(node.left,list,cur+String.valueOf(node.val)+"->");
        }else if(node.left==null&&node.right==null) {
            list.add(cur+String.valueOf(node.val));
        }else if(node.left==null){
            addToList(node.right,list,cur+String.valueOf(node.val)+"->");
        }else{
            addToList(node.left,list,cur+String.valueOf(node.val)+"->");
        }
    }
}