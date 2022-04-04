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
    public ListNode swapNodes(ListNode head, int k) {
        
        List<ListNode> op =new ArrayList<>();
        ListNode ptr = head;
        while(ptr!=null)
        {
            op.add(ptr);
            ptr = ptr.next;
        }
        int n = op.size();
        int temp = op.get(k-1).val;
        op.get(k-1).val = op.get(n-k).val;
        op.get(n-k).val = temp;
        
        
        return head;
        
        
    }
}