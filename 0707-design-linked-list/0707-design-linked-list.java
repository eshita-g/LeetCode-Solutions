class Node{
    int val;
    Node next;
    Node(int val)
    {
        this.val = val;
    }
}
class MyLinkedList{
    
    Node head;
    int length;
    
    public MyLinkedList() {
        
        this.head = null;
        this.length = 0;
    }
    
    public int get(int index) {
        
          if(index >= length)
              return -1;
           int c = 0;
           Node temp = head;
        while(c < index)
        {
            System.out.println(temp.val);
            temp = temp.next;

            c++;
        }
        
        return temp.val;
    }
    
    public void addAtHead(int val) {
        
        Node p = new Node(val);
        p.next = head;
        head = p;
        length++;
        
        
    }
    
    public void addAtTail(int val) {
        
        if(head == null)
        {
            addAtHead(val);
            return;
        }
        Node p = new Node(val);
        p.next = null;
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = p;
        length++;
    }
    
    public void addAtIndex(int index, int val) {
     
        if(index > length)
            return;
        int c = 1;
        if(index == 0)
        {
            addAtHead(val);
        }
        else
        {
            Node p = new Node(val);
            Node temp = head;
            while(c < index)
            {
                temp = temp.next;
                c++;
            }
            Node next = temp.next;
            temp.next = p;
            p.next = next;
            length++;
        }
    
    }
    
    public void deleteAtIndex(int index) {
        
        if(index >= length)
            return;
        if(index == 0)
        {
            head = head.next;
            length--;
        }
        else
        {
            int c = 1;
            Node temp = head;
            while(c  < index)
            {
                temp = temp.next;
                c++;
            }
            temp.next = temp.next.next;
            length--;
        }
        
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */