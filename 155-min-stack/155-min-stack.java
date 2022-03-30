class MinStack {
    
    ArrayList<Integer> list = new ArrayList<Integer>();

    public MinStack() {
        
    
    }
    
    public void push(int val) {
        
        list.add(val);
    }
    
    public void pop() {
        
        int n = list.size();
        list.remove(n-1);
    }
    
    public int top() {
        
        int n = list.size();
        int p = list.get(n-1);
        
        
        return p;
        
    }
    
    public int getMin() {
        
        int min = list.get(0);
        for(int i = 1;i<list.size();i++)
        {
            if(min > list.get(i))
            {
                min = list.get(i);
            }
        }
        
        
        return min;
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