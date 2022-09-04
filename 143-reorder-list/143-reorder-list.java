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
    public ListNode rev(ListNode head)
    {
        ListNode cur = head;
        ListNode prev = null;
        ListNode temp;
        while(cur != null)
        {
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        
        return prev;
    }
    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null)
            return;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next != null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode ptr2 = rev(slow.next);   
        slow.next = null;
        ListNode ptr1 = head;
        while(ptr2 != null)
        {
              ListNode cpt = ptr1.next;
              ptr1.next = ptr2;
              ListNode tpt = ptr2.next;
              ptr2.next = cpt;
              ptr1 = cpt;
              ptr2 = tpt;
            
              
            
        }
    }
}