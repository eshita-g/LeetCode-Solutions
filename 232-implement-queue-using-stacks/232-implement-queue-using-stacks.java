class MyQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    int front;
    int bottomOfs1;
    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(s1.isEmpty() && s2.isEmpty())
            front = x;
        else if(s1.isEmpty())
            bottomOfs1 = x;
        
        s1.push(x);
    }
    
    public int pop() {
        
        int ans;
        if(s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.peek());
                s1.pop();
            }
        }
        ans = s2.peek();
        s2.pop();
        if(!s2.isEmpty())
        {
            front = s2.peek();
        }
        else if(!s1.isEmpty())
        {
            front = bottomOfs1;
        }
        return ans;
    }
    
    public int peek() {
     
        return front;
    }
    
    public boolean empty() {
        
        return s1.isEmpty() && s2.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */