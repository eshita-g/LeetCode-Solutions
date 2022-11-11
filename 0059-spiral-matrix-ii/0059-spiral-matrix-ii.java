class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] res = new int[n][n];
        int t = 0,l = 0,b = n-1,r = n-1;
        int i = 1;
        int c = 1;
        int dir = 1;
        while(c <= n*n)
        {
            switch(dir)
            {
                case 1:
                    for(int j=l;j<=r;j++)
                    {
                        res[t][j] = i;
                        i++;
                        c++;
                    }
                    dir = 2;
                    t++;
                    break;
                case 2:
                    for(int j=t;j<=b;j++)
                    {
                        res[j][r] = i;
                        i++;
                        c++;
                    }
                    dir = 3;
                    r--;
                    break;
                    
                case 3:
                    for(int j=r;j>=l;j--)
                    {
                        res[b][j] = i;
                        i++;
                        c++;
                    }
                    dir = 4;
                    b--;
                    break;
                    
                case 4:
                    for(int j=b;j>=t;j--)
                    {
                        res[j][l] = i;
                        i++;
                        c++;
                    }
                    dir = 1;
                    l++;
                    break;
                    
                    
            }
        }
        
        return res;
    }
}