class Entry{
    
    int k;
    int v;
    Entry next;
    
    Entry(int k,int v)
    {
        this.k = k;
        this.v = v;
    }
}
class MyHashMap {

    public Entry[] list;
    
    public MyHashMap() {
        
        list  = new Entry[10001];
    }
    
    public void put(int key, int value) {
        
        int hashCode  = Integer.hashCode(key) % list.length;
        Entry node = list[hashCode];
        System.out.println(hashCode);
        if(node == null)
        {
            Entry newNode = new Entry(key,value);
            list[hashCode] = newNode;
            
        }
        else
        {
            Entry previous = node;
            while(node != null)
            {
                if(node.k == key)
                {
                    node.v = value;
                    return;
                    
                }
                previous = node;
                node = node.next;
            }
            Entry newNode = new Entry(key,value);
            previous.next = newNode;
            
        }
        
        
        
    }
    
    public int get(int key) {
        
        
        int hashCode =  Integer.hashCode(key)%list.length;
        
        Entry node = list[hashCode];
        while(node != null)
        {
            if(node.k == key)
            {
                return node.v;
            }
            node = node.next;
            
        }
        
        return -1;
        
    }
    
    public void remove(int key) {
        
        int hashCode =  Integer.hashCode(key)%list.length;
        Entry node = list[hashCode];
        if(node == null)
            return;
        
        if(node.k == key)
        {
            list[hashCode] = node.next;
        }
        
        Entry prev = node;
        while(node.next != null)
        {
            if(node.next.k == key)
            {
                node.next = node.next.next;
                return;
            }
            node = node.next;
        }
        
    
        }


    }



/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */