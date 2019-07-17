/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }else if(headA == headB){
            return headA;
        }else{
            Set<ListNode> set = new HashSet<>();
            ListNode temp = headA;
            while (temp!=null){
                set.add(temp);
                temp = temp.next;
            }
            ListNode temp1 = headB;
            while (temp1!=null){
                if(set.contains(temp1)) {
                    return temp1;
                }
                temp1 = temp1.next;
            }

        }
        return null;
    }
}