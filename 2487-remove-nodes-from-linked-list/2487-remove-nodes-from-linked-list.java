/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        
         Stack<Integer> stk = new Stack<>();
         if(head == null)
             return null;
        
        
        while(head != null){
            
            while(!stk.isEmpty() && head.val > stk.peek()){
                stk.pop();
            }
            stk.push(head.val);
            head = head.next;
        }
        ListNode ptr = new ListNode(-1);
        ListNode cpt = ptr;
        while(!stk.isEmpty()){
            
            ListNode tpt = new ListNode(stk.pop());
            cpt.next = tpt;
            cpt = tpt;
        }
        ListNode cur = ptr.next;
        ListNode prev = null;
        ListNode after = null;
        while(cur != null){
            
            after = cur.next;
            cur.next = prev;
            prev = cur;
            cur = after;
            
        }
        
        return prev;
    
        
    }
}