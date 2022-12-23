class Solution {
    public int helper(int i,int buy,int[][] dp,int[] prices)
    {
        if(i>=prices.length)
            return 0;
        if(dp[i][buy] != -1)
            return dp[i][buy];
        
        if(buy == 1)
        {
            dp[i][buy] = Math.max(-prices[i] + helper(i+1,0,dp,prices), 0+helper(i+1,1,dp,prices));
            return dp[i][buy];
        }
        dp[i][buy] = Math.max(prices[i] + helper(i+2,1,dp,prices), 0 + helper(i+1,0,dp,prices));
        
        return dp[i][buy];
    }
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int[][] dp = new int[n][2];
        for(int[] temp: dp)
        {
            Arrays.fill(temp,-1);
        }
        
        return helper(0,1,dp,prices);
    }
}