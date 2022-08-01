class RandomizedSet {

    List<Integer> nums;
    HashMap<Integer,Integer> p;
    Random r;
    public RandomizedSet() {
        
        nums = new ArrayList<>();
        p = new HashMap<>();
        r = new Random();
    }
    
    public boolean insert(int val) {
        
        if(p.containsKey(val))
            return false;
        
        int last = nums.size();
        nums.add(val);
        p.put(val,last);
        return true;
    }
    
    public boolean remove(int val) {
        
        if(!p.containsKey(val))
            return false;
        
        int last = nums.size() - 1;
        int newLast = p.get(val);
        int lastVal = nums.get(last);
        if(last != newLast)
        {
            swap(last,newLast);
            p.put(lastVal,newLast);
        }
        nums.remove(last);
        p.remove(val);
        return true;
    }
    
    public int getRandom() {
        
        int index = r.nextInt(nums.size());
        return nums.get(index);
        
    }
    private void swap(int i,int j)
    {
        int temp = nums.get(i);
        nums.set(i,nums.get(j));
        nums.set(j,temp);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */