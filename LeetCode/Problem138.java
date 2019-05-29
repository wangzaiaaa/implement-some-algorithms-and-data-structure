/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }else {
            HashMap<Node,Node> map = new HashMap<Node, Node>();
            Node node = head;
            Node res = new Node(node.val);
            Node temp = res;
            map.put(node,res);
            node = node.next;
            while (node!=null){
                temp.next = new Node(node.val);
                temp = temp.next;
                map.put(node,temp);
                node = node.next;
            }
            Node temhead1 = head;
            Node temhead2 = res;
            while (temhead1!=null){
                temhead2.random = map.get(temhead1.random);
                temhead1 = temhead1.next;
                temhead2 = temhead2.next;
            }
            return res;
        }
    }
}