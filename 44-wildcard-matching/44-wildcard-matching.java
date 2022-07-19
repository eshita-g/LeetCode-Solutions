class Solution {
    int last = -1;
    public boolean isMatch(int i,int j,String s, String p,int[][] res)
    {
        if(i < 0 && j<0)
        {
            return true;
        }
        if( i >= 0 && j <0)
            return false;
        if(i < 0 && j >= 0)
        {
            if( j<= last)
                return true;
            
            return false;
        }
        
        if(res[i][j] != -1)
            return res[i][j] == 0 ? false : true;
        
        if(p.charAt(j) == '?')
        {
            boolean result = isMatch(i-1,j-1,s,p,res);
            res[i][j] = result == false ? 0 : 1;
        }
        else if(p.charAt(j) == '*')
        {
            boolean a = isMatch(i,j-1,s,p,res);
            boolean b = isMatch(i-1,j,s,p,res);
            res[i][j] = a || b == true ? 1 : 0 ;
        }
        else
        {
            if(s.charAt(i) == p.charAt(j))
            {
                boolean res1 = isMatch(i-1,j-1,s,p,res);
                res[i][j] = res1 == false ? 0 : 1;
            }
            else
            {
                res[i][j] = 0;
            }
        }
        
        return res[i][j] == 0 ? false : true;
    }
    public boolean isMatch(String s, String p) {
        
        int m = s.length();
        int n = p.length();
        int[][] res = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                res[i][j] = -1;
            }
        }
        int i = 0;
        while(i < n)
        {
            if(p.charAt(i) == '*')
                i++;
            else
                break;
        }
        last = i - 1;
        return isMatch(m-1,n-1,s,p,res);
        
    }
}