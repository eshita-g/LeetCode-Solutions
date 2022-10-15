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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode cur = head;
        ListNode prev = null;
        ListNode after = null;
        while(left > 1)
        {
            prev = cur;
            cur = cur.next;
            left--;
            right--;
        }
        ListNode start = prev;
        ListNode tail = cur;
        while(right > 0)
        {
            
            after = cur.next;
            cur.next = prev;
            prev = cur;
            cur = after;
            right--;
        }
        
        if(start != null)
        {
            start.next = prev;
            
        }
        else
        {
            head = prev;
        }
        tail.next = cur;
        
        return head;
            
        
    
        
        
    }
}