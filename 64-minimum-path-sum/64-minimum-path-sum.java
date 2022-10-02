class Solution {
    public int minPathSum(int[][] grid) {
        
      int m = grid.length;
      int n = grid[0].length;
      int[][] dp = new int[m][n];
      int sum = 0;
      for(int i=0;i<n;i++)
      {
          sum = sum + grid[0][i];
          dp[0][i] = sum;    
      }
      sum = 0;
      for(int i=0;i<m;i++)
      {
          sum = sum + grid[i][0];
          dp[i][0] = sum; 
      }
      int minVal;  
      for(int i=1;i<m;i++)
      {
          for(int j=1;j<n;j++)
          {
              minVal = Math.min(dp[i-1][j],dp[i][j-1]);
              dp[i][j] = minVal + grid[i][j];
          }
      }
        
      return dp[m-1][n-1];  
        
    }
}