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
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        addToList(root,ans);
        return ans;
    }
    public void addToList(Node root,List<Integer> ans){
        if(root==null) return;
        List<Node> nodeList = root.children;
        for(Node node:nodeList){
            if(node.children==null) ans.add(node.val);
            else{
                addToList(node,ans);
            }
        }
        ans.add(root.val);
    }
}