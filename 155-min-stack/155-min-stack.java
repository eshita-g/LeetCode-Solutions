class MinStack {
   long min;
    Stack<Long> s;

    public MinStack() {
       s=new Stack<>();
        min = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        if(s.isEmpty()){
            min=val;
            s.push(1l*val);
        }
        else{
            if(min<=val){
                s.push(1l*val);
            }
            else{
                s.push(2l*val - min);
                min=val;
            }
        }
    }
    
    public void pop() {
        if(s.isEmpty()){return;}
        long popped=s.pop();
        if(popped<min){
            min=2l*min-popped;
        }
        
    }
    
    public int top() {
        if(s.isEmpty()){return -1;}
        long top=s.peek();
        if(top<min){
            return (int)min;
        }
        else{
            return (int)top;
        }
        
    }
    
    public int getMin() {
        if(s.isEmpty())return -1;
        return (int)min;
        
    }
}