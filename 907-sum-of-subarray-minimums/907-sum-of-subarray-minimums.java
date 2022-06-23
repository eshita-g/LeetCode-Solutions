class Solution {
    public int sumSubarrayMins(int[] arr) {
        int mod = 1000000007;
        Stack<Integer> stk = new Stack<>();
        int n = arr.length;
        int[] pse = new int[n];
        int[] nse = new int[n];
        stk.push(0);
        for(int i=1;i<n;i++)
        {
            while(!stk.isEmpty() && arr[i] < arr[stk.peek()])
            {
                nse[stk.peek()] = i;
                stk.pop();
            }
            stk.push(i);
        }
        while(!stk.isEmpty())
        {
            nse[stk.peek()] = n;
            stk.pop();
        }
        stk.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
            while(!stk.isEmpty() && arr[i] <= arr[stk.peek()])
            {
                pse[stk.peek()] = i;
                stk.pop();
            }
            stk.push(i);
        }
        while(!stk.isEmpty())
        {
            pse[stk.peek()] = -1;
            stk.pop();
        }
        long ans = 0;
        for(int i=0;i<n;i++)
        {
            int l = i - pse[i];
            int r = nse[i] - i;
            ans  = ( ans + ((long)arr[i]*l*r)%mod)%mod; 
            
        }
        return (int)ans;
    }
}