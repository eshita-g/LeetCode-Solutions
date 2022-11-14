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
    public ListNode merge(ListNode h1,ListNode h2)
    {
        if(h1 == null)
            return h2;
        if(h2 == null)
            return h1;
        ListNode head;
        ListNode temp;
        if(h1.val < h2.val)
        {
            head = h1;
            temp = head.next;
            head.next = null;
            head.next = merge(temp,h2);
            
        }
        else
        {
            head = h2;
            temp = head.next;
            head.next = null;
            head.next = merge(h1,temp);
        }
        
        return head;
    }
    public ListNode mergeK(ListNode[] list,int i,int j)
    {
        if(i == j)
            return list[i];
        
        int m = (i+j)/2;
        ListNode h1 = mergeK(list,i,m);
        ListNode h2 = mergeK(list,m+1,j);
        
        return merge(h1,h2);
    }
    
    public ListNode mergeKLists(ListNode[] lists) {
        
        int n = lists.length;
        if( n== 0)
            return null;
        
        return mergeK(lists,0,n-1);
    }
}