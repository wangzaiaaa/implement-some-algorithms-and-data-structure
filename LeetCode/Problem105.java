/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Problem105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null||inorder==null||preorder.length!=inorder.length) return null;
        return rebuildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    public static TreeNode rebuildTree(int [] pre,int ps,int pe,int [] in,int is,int ie){
        if(ps>pe) return null;
        int index = is;
        int val = pre[ps];
        while(index<=ie&&in[index]!=val) index++;
        if(index>ie) return null;
        TreeNode node = new TreeNode(val);
        node.left = rebuildTree(pre,ps+1,ps+index-is,in,is,index-1);
        node.right =  rebuildTree(pre,ps+index-is+1,pe,in,index+1,ie);
        return node;
        
    }
}