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
    public ListNode reverse(ListNode head)
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
    public int[] nextLargerNodes(ListNode head) {
        
        if(head == null)
            return new int[0];
        int count = 0;
        ListNode cur  = head;
        while(cur!=null)
        {
            count++;
            cur = cur.next;
        }
        System.out.println(count);
        int[] res = new int[count];
        cur = head;
        ListNode cur1 = reverse(cur);
        Stack<Integer> stk = new Stack<>();
        int i = count-1;
        while(cur1 != null && i>=0 )
        {
            while(!stk.isEmpty() && stk.peek() <= cur1.val)
            {
                stk.pop();
            }
            if(stk.isEmpty())
            {
                res[i] = 0;
            }
            else
            {
                res[i] = stk.peek();
            }
            stk.push(cur1.val);
            i--;
            cur1 = cur1.next;
                
        }
        return res;
    }
}