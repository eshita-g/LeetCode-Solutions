class Solution {
    public int getMinimum(List<List<Integer>> triangle,int[][] dp,int i,int j)
    {
        if(dp[i][j] != -1)
            return dp[i][j];
        
        dp[i][j] = triangle.get(i).get(j);
        if(i+1  < triangle.size())
        {
            dp[i][j] = dp[i][j] + Math.min(getMinimum(triangle,dp,i+1,j),getMinimum(triangle,dp,i+1,j+1));
        }
        
        return dp[i][j];
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int m = triangle.size();
        int[][] dp = new int[m][m];
        for(int[] row : dp)
        {
            Arrays.fill(row,-1);
        }
        return getMinimum(triangle,dp,0,0);
        
    }
}