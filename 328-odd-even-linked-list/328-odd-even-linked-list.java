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
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return null;
        if(head.next == null || head.next.next == null)
            return head;
        ListNode tail1 = head;
        ListNode tail2 = head.next;
        ListNode evenHead = head.next;
        while(tail2 != null && tail2.next != null)
        {
            tail1.next = tail1.next.next;
            tail2.next = tail2.next.next;
            
            tail1 = tail1.next;
            tail2 = tail2.next;
            
        }
        tail1.next = evenHead;
        
        return head;
        
        
        
    }
}