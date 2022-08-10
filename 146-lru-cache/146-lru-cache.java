class LRUCache {
    
    class Node{
        
        int key;
        int value;
        Node prev;
        Node next;
        Node(int k,int v){
            
            key = k;
            value = v;    
        }
        
    }
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    HashMap<Integer,Node> hash;
    int cap;
    

    public LRUCache(int capacity) {
        
        cap = capacity;
        hash = new HashMap<>();
        head.next = tail;
        tail.prev = head;
        
    }
    
    public int get(int key) {
        
        if(!hash.containsKey(key))
        {
            return -1;
        }
        Node ans = hash.get(key);
        remove(ans);
        insert(ans);
        
        return ans.value;
    }
    
    public void put(int key, int value) {
        
        
        if(hash.containsKey(key))
        {
            remove(hash.get(key));
        }
        if(hash.size() == cap)
        {
            remove(tail.prev);
            
        }
       insert(new Node(key,value));
        
    
    }
    public void remove(Node cur)
    {
        hash.remove(cur.key);
        cur.prev.next = cur.next;
        cur.next.prev = cur.prev;
    }
    public void insert(Node cur)
    {
        hash.put(cur.key,cur);
        cur.next = head.next;
        cur.next.prev = cur;
        head.next = cur;
        cur.prev = head;
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */