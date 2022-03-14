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
    public ListNode deleteMiddle(ListNode head) {
        ListNode ptr = head;
        if(ptr.next == null)
            return null;
        int n = -1;
        while(ptr != null)
        {
            ptr = ptr.next;
            n++;
        }
        int m;
        if( n%2 != 0)
        {
             m = n/2 + 1;
        }
        else
        {
             m = n/2;
        }
        ptr = head;
        int i = 0;
        while( i!= m-1 )
        {
            ptr = ptr.next;
            i++;
            
        }
        ptr.next = ptr.next.next;
        
        return head;
        
        
    }
}