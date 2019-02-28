/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Problem21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0);
        if(l1==null&&l2==null) return l1;
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode temp = answer;
        if(l1.val<=l2.val){
            temp = l1;
            l1=l1.next;
        }else{
            temp = l2;
            l2 = l2.next;
        }
        answer = temp;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                temp.next = l1;
                l1=l1.next;
                temp = temp.next;
            }else{
                temp.next = l2;
                l2=l2.next;
                temp = temp.next;
            }
        }
        if(l1!=null){
            while(l1!=null){
                temp.next=l1;
                l1=l1.next;
                temp = temp.next;
            }
        }
        if(l2!=null){
            while(l2!=null){
                temp.next=l2;
                l2=l2.next;
                temp = temp.next;
            }
        }
        return answer;
    }
}