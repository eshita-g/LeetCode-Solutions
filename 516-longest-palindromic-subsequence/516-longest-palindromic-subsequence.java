class Solution {
    public int lps(int i,int j, String s,int[][] ans)
    {
        if(i > j)
            return 0;
        if(i == j)
            return 1;
        
        if(ans[i][j] != -1)
            return ans[i][j];
        
        if(s.charAt(i) == s.charAt(j))
        {
            ans[i][j] = 2 + lps(i+1,j-1,s,ans);
        }
        else
        {
            ans[i][j] = Math.max(lps(i+1,j,s,ans),lps(i,j-1,s,ans));
        }
        
        
        return ans[i][j];
        
    }
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] ans =  new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ans[i][j] = -1;
            }
        }
        return  lps(0,n-1,s,ans);
    
    }
}