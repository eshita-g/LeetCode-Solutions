class Solution {
    public void solve(char[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int dir[][] = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        for(int j=0;j<n;j++)
        {
            if(grid[0][j] == 'O')
            {    
              dfs(0,j,grid,dir);
                  
            }
            if(grid[m-1][j] == 'O')
            {
                dfs(m-1,j,grid,dir);
            }
        }
        for(int i=0;i<m;i++)
        {
            if(grid[i][0] == 'O')
            {
                dfs(i,0,grid,dir);
            }
            if(grid[i][n-1] == 'O')
            {
                dfs(i,n-1,grid,dir);
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == 'O')
                {
                    grid[i][j] = 'X';
                }
                else if(grid[i][j] == 'P')
                {
                    grid[i][j] = 'O';
                }
            }
        }
            
    }
    public void dfs(int i,int j,char[][] grid,int[][] dir)
    {
        if(i < 0 || i >= grid.length || j<0 || j>=grid[0].length || grid[i][j]  == 'P' || grid[i][j] == 'X')
            return;
        
        grid[i][j] = 'P';
        for(int k=0;k<4;k++)
        {
           dfs(i+dir[k][0], j+dir[k][1],grid,dir);
        }
    }
}