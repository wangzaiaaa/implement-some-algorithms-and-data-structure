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
    public List<List<Integer>> levelOrder(Node root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        List<Integer> temp = new ArrayList<>();
        Node tempNode = null;
        while(!queue.isEmpty()){
            tempNode = queue.poll();
            if(tempNode==null){
                if(queue.size()>0)queue.offer(null);
                ans.add(temp);
                temp = new ArrayList<>();
            }else{
                temp.add(tempNode.val);
                if(tempNode.children!=null){
                    for(Node node:tempNode.children){
                        queue.offer(node);
                    }
                }
            }
        }
        return ans;
    }
    
}