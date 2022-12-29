class MyCalendar {

    TreeMap<Integer,Integer> mp;
    public MyCalendar() {
        
        mp = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        
        Integer floor = mp.floorKey(start);
        Integer ceil = mp.ceilingKey(start);
    
        if(floor != null && mp.get(floor) > start || ceil!=null && end > ceil)
            return false;
        
        mp.put(start,end);
        
        return true;
        
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */