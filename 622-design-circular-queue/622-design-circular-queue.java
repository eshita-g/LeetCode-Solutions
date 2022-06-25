class MyCircularQueue {
    
    int[] arr;
    int front = 0;
    int rear = -1;
    int size = 0;
    int count = 0;
    

    public MyCircularQueue(int k) {
      
        arr = new int[k];
        size = k;
        
    }
    
    public boolean enQueue(int value) {
        
        if(isFull())
            return false;
        
        count++;
        rear = (rear + 1)%size;
        arr[rear] = value;
        return true;
    }
    
    public boolean deQueue() {
        
        if(count == 0)
            return false;
        
        front = (front+1)%size;
        count--;
        return true;
        
    }
    
    public int Front() {
        
        return isEmpty() ? -1: arr[front];
        
    }
    
    public int Rear() {
        return isEmpty() ? -1: arr[rear];
        
    }
    
    public boolean isEmpty() {
        
        return count==0;
        
    }
    
    public boolean isFull() {
        
        return count==size;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */