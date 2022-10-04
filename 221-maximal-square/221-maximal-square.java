class Solution {
    public int maximalSquare(char[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int res = 0;
        for(int i=0;i<m;i++)
        {
            dp[i][0] = matrix[i][0] - '0';
            if(dp[i][0] == 1)
            {
                res = 1;
            }
        }
        for(int i=0;i<n;i++)
        {
            dp[0][i] = matrix[0][i] - '0';
            if(dp[0][i] == 1)
            {
                res  = 1;
            }
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(matrix[i][j]  == '1')
                {
                    int a = dp[i-1][j-1];
                    int b = dp[i-1][j];
                    int c = dp[i][j-1];
                    dp[i][j] = 1 + Math.min(a,Math.min(b,c));
                    res = Math.max(res,dp[i][j]);
                }
            }
        }
        
        return res*res;
    }
}