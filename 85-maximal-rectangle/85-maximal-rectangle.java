class Solution {
    public int maximalRectangle(char[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        int[] heights = new int[n];
        int area = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j] == '1')
                {
                    heights[j]++;
                }
                else
                {
                    heights[j] = 0;
                }
            }
            area = Math.max(area,getMax(heights,n));
        }
        
        return area;
        
    }
    public int getMax(int[] heights,int n) {
        
        Stack<Integer> stk = new Stack<>();
        //int n = heights.length;
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
        int maxArea = 0;
        for(int i=0;i<n;i++)
        {
            maxArea = Math.max(maxArea, (nse[i] - pse[i] - 1)* heights[i]);
            System.out.print(maxArea);
        }
        
        return maxArea;
    }
}