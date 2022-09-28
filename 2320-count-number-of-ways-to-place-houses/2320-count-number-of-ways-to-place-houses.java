class Solution {
    public int countHousePlacements(int n) {
        
        long m = 1000000007;
        long[] dp = new long[n+1];
        dp[0] = 1;
        dp[1] = 2;
        for(int i=2;i<=n;i++)
        {
            dp[i] = (dp[i-1] + dp[i-2])%m;
        }
        int res = (int)((dp[n]*dp[n])%m);
        
        return res;
        
    }
}