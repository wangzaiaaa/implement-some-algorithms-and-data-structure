/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Problem19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp = head;
        
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        if(head==null || length<n)return head;
        else if(length==n) return head.next;
        ListNode current = head;
        for(int i=1;i<=length-n-1;i++){
            current = current.next;    
        }
        ListNode Node = current.next;
        current.next = Node.next;
        return head;
        
    }
}