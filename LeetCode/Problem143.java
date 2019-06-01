/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null) return null;
        ListNode temp = new ListNode(0);
        temp.next = head;
        while(head!=null&&head.next!=null){
            if(head.val<head.next.val){
                head = head.next;
                continue;
            }
            ListNode pre = temp;
            while(pre.next.val<head.next.val) pre = pre.next;
            ListNode cur = head.next;
            head.next = cur.next;
            cur.next = pre.next;
            pre.next = cur;
             
        }
        return temp.next;
        
    }
}