class Solution {
    
    public int getED(int i,int j,String w1,String w2, int[][] ans)
    {
        if(i == -1)
            return j+1;
        if(j == -1)
            return i+1;
        
        if(ans[i][j] != -1)
            return ans[i][j];
        
        if(w1.charAt(i) == w2.charAt(j))
            ans[i][j] =  getED(i-1,j-1,w1,w2,ans);
        
        else
        {
            ans[i][j] =  1 + Math.min(getED(i-1,j,w1,w2,ans), getED(i,j-1,w1,w2,ans));
        }
        
        return ans[i][j];
    }
    
    public int minDistance(String word1, String word2) {
        
        int m = word1.length();
        int n = word2.length();
        int[][] ans = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ans[i][j] = -1;
            }
        }
        
        return getED(m-1,n-1,word1,word2,ans);
        
    }
}