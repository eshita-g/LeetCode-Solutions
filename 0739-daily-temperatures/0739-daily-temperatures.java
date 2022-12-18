class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        int[] res = new int[n];
        
        if(n == 1)
        {
            return res;
        }
        Stack<Integer> stk = new Stack<>();
        stk.push(0);
        for(int i=1;i<n;i++)
        {
            while(!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()])
            {
                res[stk.peek()] = i - stk.peek();
                stk.pop();
                
            }
            stk.push(i);
        }
        
        return res;
        
    }
}