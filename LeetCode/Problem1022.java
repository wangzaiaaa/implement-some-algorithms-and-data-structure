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
    public int sumRootToLeaf(TreeNode root) {
        if(root==null){
            return 0;
        }
        List<String> list = new ArrayList<>();
        addToList(root,"",list);
       
        int ans = 0;
        if(list.size()<1){
            return ans;
        }else{
            for(int i=0;i<list.size();i++){
                ans += binaryStringToInteger(list.get(i));
            }
            return (int)(ans % (Math.pow(10,9) + 7));
        }
       
    }
    public void addToList(TreeNode node,String cur,List<String> list){
        if(node.left==null&&node.right==null){
            cur += String.valueOf(node.val);
            list.add(cur);
            return;
        }else{
            
            if(node.left!=null){
                addToList(node.left,cur+String.valueOf(node.val),list);
            }
            if(node.right!=null){
                addToList(node.right,cur+String.valueOf(node.val),list);
            }
        }
    }
    public int binaryStringToInteger(String binaryString){
        int res = 0;
        if(binaryString==null||binaryString.length()<1){
            return 0;
        }else{
            for(int i=0;i<binaryString.length();i++){
                res += (binaryString.charAt(i) - 48) * Math.pow(2,binaryString.length()-i-1);
            }
            return res;
        }
    }
    
}