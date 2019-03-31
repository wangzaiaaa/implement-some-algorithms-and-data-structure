/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Problem83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode cur = head,hail=head.next;
        while(hail!=null){
            while(hail!=null&&hail.val==cur.val){
                hail=hail.next;
            }
            cur.next = hail;
            cur = cur.next;
            if(hail!=null) hail = hail.next;
        }
        return head;
        
    }
