class Logger {

    HashMap<String,Integer> mp;
    public Logger() {
        
        mp = new HashMap<>();
        
        
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        
        if(!mp.containsKey(message))
        {
            mp.put(message,timestamp);
            return true;
        }
        int value = mp.get(message);
        if(value + 10 <= timestamp)
        {
            mp.put(message,timestamp);
            return true;
        }
        
        
        return false;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */