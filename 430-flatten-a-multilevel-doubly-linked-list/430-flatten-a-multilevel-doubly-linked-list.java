/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        
        if(head == null)
            return head;
        
        traverse(head,null);
        Node ptr = head;
        while(ptr.next != null)
        {
            ptr.next.prev = ptr;
            ptr = ptr.next;
        }
        
        return head;
    }
    
    public void traverse(Node cur,Node next)
    {
        if(cur == null)
            return;
        
        if(cur.next == null && cur.child == null)
        {
            cur.next = next;
            return;
            
        }
        if(cur.child != null)
        {
            Node temp = cur.next;
            cur.next = cur.child;
            cur.child = null;
            traverse(cur.next,temp);
        }
        traverse(cur.next,next);
    }
}