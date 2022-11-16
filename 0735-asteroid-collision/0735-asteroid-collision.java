class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        
        Stack<Integer> stk = new Stack();
        int n = asteroids.length;
        if(n==0 || n<=1)
            return asteroids;
        
        for(int i=0;i<n;i++)
        {
            int col = 1;
            while(!stk.isEmpty() && asteroids[i] < 0 && stk.peek() > 0 && col==1)
            {
                if(-asteroids[i] > stk.peek())
                {
                    stk.pop();
                    
                }
                else if(-asteroids[i] == stk.peek())
                {
                    stk.pop();
                    col = 0;
                }
                else
                {
                    col = 0;
                }
                
                
            }
            if(col == 1)
            {
                stk.push(asteroids[i]);
            }
        }
        
        int[] ans = new int[stk.size()];
        for(int i=ans.length-1;i>=0;i--)
        {
            ans[i] = stk.pop();
        }
        
        return ans;
    }
}