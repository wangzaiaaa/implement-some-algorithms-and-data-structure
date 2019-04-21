/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Problem654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums==null||nums.length<1) return null;
        return constructMaximumBinaryTree(nums,0,nums.length-1);
    }
    public TreeNode constructMaximumBinaryTree(int [] nums,int start,int end){
        if(start>end) return null;
        int index = maxindex(nums,start,end);
        TreeNode node = new TreeNode(nums[index]);
        node.left = constructMaximumBinaryTree(nums,start,index-1);
        node.right = constructMaximumBinaryTree(nums,index+1,end);
        return node;
    }
    public int maxindex(int [] nums,int start,int end){
        int index = start,max_value = nums[start];
        for(int i = start;i<=end;i++){
            if(nums[i]>max_value){
                max_value = nums[i];
                index = i;
            }
        }
        return index;
    }
}