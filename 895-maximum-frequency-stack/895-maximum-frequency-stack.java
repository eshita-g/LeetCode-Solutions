class FreqStack {
    
    Map<Integer,Integer> frequency = null;
    Map<Integer,Stack<Integer>> freqStack = null;
    int maxFreq;
    
    public FreqStack() {
        frequency = new HashMap<>();
        freqStack = new HashMap<>();
        maxFreq = 0;
    }
    
    public void push(int val) {
        
        int freq = frequency.getOrDefault(val,0)+1;
        frequency.put(val,freq);
        maxFreq = Math.max(maxFreq,freq);
        if(!freqStack.containsKey(freq)){
            freqStack.put(freq,new Stack<Integer>());
        }
        freqStack.get(freq).push(val);
        
    }
    
    public int pop() {
        int poppedElement = freqStack.get(maxFreq).pop();
        frequency.put(poppedElement,maxFreq-1);
        if(freqStack.get(maxFreq).size()==0){
            maxFreq = maxFreq-1;
        }
        return poppedElement;
    }
}