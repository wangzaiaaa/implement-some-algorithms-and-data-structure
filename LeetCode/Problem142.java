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
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        Set<ListNode> set = new HashSet<>();
        ListNode node = head,answer = null;
        set.add(node);
        while(node.next!=null){
            if(set.contains(node.next)){
                answer = node.next;
                break;
            }else{
                set.add(node.next);
                node = node.next;
            }
        }
        return answer;
    }
}