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
    public ListNode reverseKGroup(ListNode head, int k) {
     
        int cnt = 0;
        ListNode cur = head;
        while(cur != null && cnt < k)
        {
            cnt++;
            cur = cur.next;
        }
        if(cnt < k)
            return head;
        cnt = 0;
        cur = head;
        ListNode prev= null;
        ListNode temp;
        while(cnt < k)
        {
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
            cnt++;
            
        }
        head.next = reverseKGroup(cur,k);
        
        return prev;
    }
}