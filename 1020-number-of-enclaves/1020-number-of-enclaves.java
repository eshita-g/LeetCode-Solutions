class Solution {
    public int numEnclaves(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int c = 0;
        for(int i=0;i<m;i++)
        {
            if(grid[i][0] == 1)
            {
                dfs(i,0,grid);
            }
            if(grid[i][n-1] == 1)
            {
                dfs(i,n-1,grid);
            }
        }
        for(int j=0;j<n;j++)
        {
            if(grid[0][j] == 1)
            {
                dfs(0,j,grid);
            }
            if(grid[m-1][j] == 1)
            {
                dfs(m-1,j,grid);
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
              if(grid[i][j] == 1)
                  c++;
            }
        }
        
        return c;
        
    }
    
    public void dfs(int i,int j,int[][] grid)
    {
        if(i < 0 || i >= grid.length || j < 0 || j>=grid[0].length)
            return;
        if(grid[i][j] != 1)
            return;
        grid[i][j] = 2;
        dfs(i,j-1,grid);
        dfs(i,j+1,grid);
        dfs(i+1,j,grid);
        dfs(i-1,j,grid);
    }
}