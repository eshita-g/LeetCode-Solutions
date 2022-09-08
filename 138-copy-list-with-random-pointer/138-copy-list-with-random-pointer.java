/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        Node cur = head;
        Node temp = null;
        Node cloneHead = null;
        while(cur != null)
        {
            temp = new Node(cur.val);
            if(cur == head)
            {
                cloneHead = temp;
            }
            Node t = cur.next;
            cur.next = temp;
            temp.next = t;
            cur = t;
            
        }
        cur  = head;
        while(cur != null)
        {
            if(cur.random != null)
            {
                cur.next.random = cur.random.next;
            }
            else
            {
                cur.next.random = null;
            }
            cur = cur.next.next;
        }
        Node cur1 = head;
        Node cur2 = cloneHead;
        while(cur2 != null && cur2.next!= null)
        {
            Node t = cur2.next;
            cur2.next = cur2.next.next;
            cur1.next = t;
            cur2 = cur2.next;
            cur1 = cur1.next;
        }
        if(cur1 != null)
            cur1.next = null;
        
        return cloneHead;
    }
}