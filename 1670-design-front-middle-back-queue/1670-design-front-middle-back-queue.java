class FrontMiddleBackQueue {

    Deque<Integer> d1;
    Deque<Integer> d2;
    
    public FrontMiddleBackQueue() {
        
        d1 = new LinkedList<>();
        d2 = new LinkedList<>();
        
    }
    
    public void pushFront(int val) {
        
        d1.addFirst(val);
    }
    
    public void pushMiddle(int val) {
        
        while(d1.size() + 1 < d2.size())
        {
            d1.addLast(d2.removeFirst());
        }
        while(d1.size() > d2.size())
        {
            d2.addFirst(d1.removeLast());
        }
        d1.add(val);
        
    }
    
    public void pushBack(int val) {
        
        d2.add(val);
    }
    
    public int popFront() {
        
        if(!d1.isEmpty())
            return d1.removeFirst();
        if(!d2.isEmpty())
            return d2.removeFirst();
        
        return -1;
    }
    
    public int popMiddle() {
        
        if(d1.isEmpty() && d2.isEmpty())
            return -1;
        
        while(d1.size() < d2.size())
        {
            d1.addLast(d2.removeFirst());
        }
        while(d1.size() > d2.size() + 1)
        {
            d2.addFirst(d1.removeLast());
        }
        return !d1.isEmpty() ? d1.removeLast() : d2.removeFirst();
        
    }
    
    public int popBack() {
        
        if(!d2.isEmpty())
            return d2.removeLast();
        if(!d1.isEmpty())
            return d1.removeLast();
        
        return -1;
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */