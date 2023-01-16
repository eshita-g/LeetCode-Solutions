class Solution {
    public int recurse(int i,int j,String s,int[][] dp)
    {
        if(i>j)
            return 0;
        if(i==j)
            return 1;
        if(dp[i][j] != -1)
            return dp[i][j];
        if(s.charAt(i) == s.charAt(j))
        {
            dp[i][j] = 2 + recurse(i+1,j-1,s,dp);
            return dp[i][j];
        }
        
        dp[i][j] = Math.max(recurse(i+1,j,s,dp),recurse(i,j-1,s,dp));
        return dp[i][j];
    }
    public int minInsertions(String s) {
        
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int[] arr:dp)
        {
            Arrays.fill(arr,-1);
            
            
        }
        int k = recurse(0,n-1,s,dp);
        
        return n-k;
        
    }
}