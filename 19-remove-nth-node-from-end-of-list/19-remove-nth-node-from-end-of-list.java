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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode p1= head;
        ListNode p2 = head;
        ListNode prev = null;
        int c = 0;
        while(c < n && p2!=null )
        {
            prev = p2;
            p2 = p2.next;
            c++;
        }
       // System.out.println(p2.val);
        if(c == n && p2 == null)
        {
            head = head.next;
            return head;
        }
        if(p2 == null)
            return null;
        
        
        while(p2.next != null)
        {
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = p1.next.next;
        
        return head;
    }
}