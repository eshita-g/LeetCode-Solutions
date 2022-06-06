/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int getCount(ListNode head)
    {
        ListNode ptr = head;
        int count = 0;
        while(ptr != null )
        {
            count++;
            ptr = ptr.next;
        }
        
        return count;
    }
    public ListNode getIntersection(int d,ListNode headA,ListNode headB)
    {
        ListNode ptr = headA;
        ListNode cpt = headB;
        for(int i=0;i<d;i++)
        {
            if(ptr == null)
                return null;
            ptr = ptr.next;
            
        }
        while(ptr!=null && cpt!=null)
        {
            if(ptr == cpt)
                return ptr;
            ptr = ptr.next;
            cpt = cpt.next;
        }
        return null;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int c1 = getCount(headA);
        int c2 = getCount(headB);
        int d;
        if(c1 > c2)
        {
            d = c1-c2;
            return getIntersection(d,headA,headB);
        }
        else
        {
            d = c2-c1;
            return getIntersection(d,headB,headA);
        }
        
    }
}