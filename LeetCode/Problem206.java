/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Problem206 {
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        Stack<ListNode> stack = new Stack<>();
        while(head!=null){
            stack.push(head);
            head = head.next;
        }
        ListNode answer = stack.pop();
        ListNode temp = answer,current = null;
        while(!stack.isEmpty()){
            current = stack.pop();
            current.next = null;
            temp.next = current;
            temp = temp.next;
        }
        return answer;
    }
}