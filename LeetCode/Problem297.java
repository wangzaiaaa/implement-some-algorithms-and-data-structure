/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
     public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
         if(root==null){
            sb.append('#');
             return sb.toString();
         }
         else{
             sb.append((char)(root.val+'0'));
             sb.append(serialize(root.left));
             sb.append(serialize(root.right));
             return sb.toString();
         }
    }

    // Decodes your encoded data to tree.
    int index = -1;
    public TreeNode deserialize(String data) {
        index++;
        if(index>=data.length()){
            return null;
        }else{
            char c = data.charAt(index);
            if(c=='#'){
                return null;
            }else{
                TreeNode node = new TreeNode((int)(c-'0'));
                node.left = deserialize(data);
                node.right = deserialize(data);
                return node;
            }
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));