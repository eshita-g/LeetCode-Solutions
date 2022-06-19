class Solution {
    public int largestRectangleArea(int[] heights) {
        
        Stack<Integer> stk = new Stack<>();
        int n = heights.length;
        int[] nse = new int[n];
        int[] pse = new int[n];
        stk.push(0);
        for(int i=1;i<n;i++)
        {
            while(!stk.isEmpty() && heights[i] < heights[stk.peek()])
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
            while(!stk.isEmpty() && heights[i] < heights[stk.peek()])
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
        int maxArea = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            maxArea = Math.max(maxArea, (nse[i] - pse[i] - 1)* heights[i]);
        }
        
        return maxArea;
    }
}