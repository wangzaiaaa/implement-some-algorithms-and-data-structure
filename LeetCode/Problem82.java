/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode preNode = null,node = head,next = null,nodeToBeDel=null;
        boolean needDelete = false;
        while (node!=null){
            next = node.next;
            needDelete = false;
            if(next!=null&&next.val==node.val) needDelete = true;
            if(!needDelete){
                preNode = node;
                node = node.next;
            }else{
                int val = node.val;
                nodeToBeDel = node;
                while (nodeToBeDel!=null&&nodeToBeDel.val==val){
                    next = nodeToBeDel.next;
                    nodeToBeDel = null;
                    nodeToBeDel = next;
                }
                if(preNode==null) head = next;
                else preNode.next = next;
                node = next;
            }
        }
        return head;

    }
}