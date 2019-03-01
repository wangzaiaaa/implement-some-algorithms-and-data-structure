/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Problem24 {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode temp = head.next;
        head.next = temp.next;
        temp.next = head;
        ListNode answer = temp;
        ListNode f = head.next;
        ListNode a = null;
        if(f!=null&&f.next!=null){
            a = f.next;
        }
        while(f!=null&&a!=null){
            f.next = a.next;
            a.next = f;
            head.next = a;
            head = head.next;
            if(head.next==null) break;
            head = head.next;
            if(head.next==null) break;
            f = head.next;
            a = f.next;
                
        }
        return answer;
    }
}