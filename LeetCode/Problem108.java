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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null||nums.length<1) return null;
        return buildBinarySerchTree(nums,0,nums.length-1);
    }
    TreeNode buildBinarySerchTree(int [] nums,int l,int r){
        if(l>r) return null;
        int mid = l + ((r-l)>>1);
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildBinarySerchTree(nums,l,mid-1);
        node.right = buildBinarySerchTree(nums,mid+1,r);
        return node;
    }
}