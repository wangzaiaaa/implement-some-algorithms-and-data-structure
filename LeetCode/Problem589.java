/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        addToList(root,ans);
        return ans;
    }
    public List<Integer> addToList(Node root,List<Integer> list){
        if(root==null) return list;
        else{
            list.add(root.val);
            if(root.children!=null){
                for(Node node:root.children){
                    addToList(node,list);
                }
            }
            return list;
        }
    }
}