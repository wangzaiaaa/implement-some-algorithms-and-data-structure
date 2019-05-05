/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        Set<ListNode> set = new HashSet<>();
        ListNode node = head;
        set.add(node);
        while(node.next!=null){
            if(set.contains(node.next)) return true;
            else{
                set.add(node.next);
                node = node.next;
            }
        }
        return false;
    }
}