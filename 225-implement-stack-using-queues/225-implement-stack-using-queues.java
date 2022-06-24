class MyStack {

     Queue<Integer> q1 = new LinkedList<Integer>();
     int top;
     
    
    public MyStack() {
        
        
        
    }
    
    public void push(int x) {
        
        q1.add(x);
        top = x;
    }
    
    public int pop() {
        
        Queue<Integer> q2 = new LinkedList<Integer>();
        while(q1.size() > 1)
        {
            top = q1.remove();
            q2.add(top);
            
        }
        int res = q1.remove();
       
        q1 = q2;
        return res;
        
    }
    
    public int top() {
     
        return top;
    }
    
    public boolean empty() {
     
        if(q1.size() == 0)
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