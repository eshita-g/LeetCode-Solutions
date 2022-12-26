class MedianFinder {

    PriorityQueue<Integer> q1;
    PriorityQueue<Integer> q2;
    
    public MedianFinder() {
        
        q1 = new PriorityQueue<>((a,b) -> b - a);
        q2 = new PriorityQueue<>();
        
    }
    
    public void addNum(int num) {
        
        if(!q1.isEmpty() && num >= q1.peek() )
        {
            q2.add(num);
        }
        else
        {
            q1.add(num);
        }
        
        if(q1.size() > q2.size() + 1)
        {
            int temp = q1.remove();
            q2.add(temp);
        }
        if(q2.size() > q1.size() + 1)
        {
            int temp = q2.remove();
            q1.add(temp);
        }
        
        
    }
    
    public double findMedian() {
        
        if(q1.size() == q2.size())
        {
            return (q1.peek() + q2.peek())/2.0;
        }
        if(q1.size() > q2.size())
        {
            return q1.peek();
        }
        
        return q2.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */