class Solution {
    static class Pair{
        int r;
        int c;
         Pair(int r,int c)
         {
             this.r = r;
             this.c = c;
         }
    }
    private static int[][] dirs = new int[][] { {1,0} ,{-1,0}, {0,1}, {0,-1} };
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        Queue <Pair> q = new LinkedList<>(); 
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j] == 0)
                {
                    q.add(new Pair(i,j));
                }
                else
                {
                    mat[i][j] = -1;
                }
            }
        }
        while(!q.isEmpty())
        {
            Pair p = q.remove();
            for(int i=0;i<4;i++)
            {
                int x = p.r + dirs[i][0];
                int y = p.c + dirs[i][1];
                if(x >= 0 && x < m && y >= 0 && y < n && mat[x][y] == -1)
                {
                  mat[x][y] = mat[p.r][p.c] + 1;
                  q.add(new Pair(x,y));
                }
            }
        }
        
        return mat;
        
    }
}