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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        ListNode cur = head.next;
        ListNode pre = head;
        int s1 = -1;
        int s2 = -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int i = 1;       
        while(cur.next != null)
        {
            if((cur.val > pre.val && cur.val > cur.next.val) || (cur.val < pre.val && cur.val < cur.next.val ) )
            {
                if(s1 == -1)
                {
                    s1 = i;
                    s2 = i;
                }
                else
                {
                    min = Math.min(min,i-s2);
                    max = Math.max(max,i-s1);
                    s2 = i;
                }
            }
            pre = cur;
            cur = cur.next;
            i++;
        }
        if(min  == Integer.MAX_VALUE)
        {
            return new int[]{-1,-1};
        }
        int[]ans = {min,max};
        
        return ans;
    }
}