class MyStack {

     Queue<Integer> q1 = new LinkedList<Integer>();
     Queue<Integer> q2 = new LinkedList<Integer>();
     int size ;
    
    public MyStack() {
        
        size = 0;
        
    }
    
    public void push(int x) {
        
        size++;
        q2.add(x);
        while(!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }
    
    public int pop() {
        
        int  p = q1.peek();
        q1.remove();
        size--;
        return p;
    }
    
    public int top() {
     
        int  p = q1.peek();
        
        return p;
    }
    
    public boolean empty() {
     
        if(size == 0)
            return true;
        
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */