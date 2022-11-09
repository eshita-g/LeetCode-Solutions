class MinStack {
    
    Stack<Long> stk;
    long curMin;

    public MinStack() {
        
          stk = new Stack<>();
          curMin = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        
         if(stk.isEmpty())
         {
             stk.push(1l*val);
             curMin = 1l*val;
         }
        else
        {
         if(val >= curMin)
         {
             stk.push(1l*val);
         }
        else
        {
            stk.push(2l*val - curMin);
            curMin = 1l*val;
        }
        }    
    }
    
    public void pop() {
        
        if(stk.isEmpty())
            return;
        long x = stk.pop();
        if(x < curMin)
        {
            curMin = 2l*curMin - x;
        }
    }
    
    public int top() {
        
        if(stk.isEmpty())
            return -1;
        
        
        long x = stk.peek();
        
        if(x >= curMin)
        {
            return (int)x;
        }
        
        return (int)curMin;
        
    }
    
    public int getMin() {
        
        if(stk.isEmpty())
            return -1;
        return (int)curMin;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */