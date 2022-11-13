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
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        ListNode[] res = new ListNode[k];
        int c = 0;
        ListNode cur = head;
        while(cur != null)
        {
            c++;
            cur = cur.next;
            
        }
        cur = head;
        int size = c/k;
        int extra  = c%k;
        for(int i=0;i<k && cur != null;i++)
        {
            
            res[i] = cur;
            for(int j=0;j < size + (extra > 0 ? 1 : 0) - 1; j++)
            {
                cur = cur.next;
                
            }
            ListNode temp = cur.next;
            cur.next = null;
            cur = temp;
            extra--;
        }
        
        return res;
    }
}