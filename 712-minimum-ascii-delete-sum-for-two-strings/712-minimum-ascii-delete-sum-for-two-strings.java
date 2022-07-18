class Solution {
    
    public int findSum(String s,int k)
    {
        int v = 0;
        for(int i=0;i<=k;i++)
        {
            v += (int)s.charAt(i);
        }
        return v;
    }
    public int getED(int i,int j,String s1,String s2,int[][] ans)
    {
        if(i == -1 )
        {
            return findSum(s2,j);
        }
        if( j == -1)
        {
            return findSum(s1,i);
        }
        if(ans[i][j] != -1)
            return ans[i][j];
        
        if(s1.charAt(i) == s2.charAt(j))
        {
            ans[i][j] = getED(i-1,j-1,s1,s2,ans);
            
        }
        else
        {
            ans[i][j] = Math.min((int)s1.charAt(i) + getED(i-1,j,s1,s2,ans) , (int)s2.charAt(j) + getED(i,j-1,s1,s2,ans));
        }
        
        return ans[i][j];
    }
    public int minimumDeleteSum(String s1, String s2) {
        
        int m = s1.length();
        int n = s2.length();
        int[][] ans =  new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ans[i][j] = -1;
            }
        }
        
        return getED(m-1,n-1,s1,s2,ans);
        
    }
}