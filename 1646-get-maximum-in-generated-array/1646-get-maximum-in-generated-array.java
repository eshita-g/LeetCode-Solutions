class Solution {
    public int getMaximumGenerated(int n) {
        if(n==0)
            return 0;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        int global = 1;
        for(int i=2;i<=n;i++)
        {
            if(i%2 == 0)
            {
                dp[i] = dp[i/2];
            }
            else
            {
                int p = i/2;
                dp[i] = dp[p] + dp[p+1]; 
            }
            global = Math.max(global,dp[i]);
        }
         
        return global;
    }
}