class Solution {
    public int closedIsland(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int[][] dir = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
        int count = 0;
        for(int i=0;i<m;i++)
        {
            if(grid[i][0] == 0)
            {
                dfs(i,0,dir,grid);
            }
            if(grid[i][n-1] == 0)
            {
                dfs(i,n-1,dir,grid);
            }
        }
        for(int j=0;j<n;j++)
        {
            if(grid[0][j] == 0)
            {
                dfs(0,j,dir,grid);
            }
            if(grid[m-1][j] == 0)
            {
                dfs(m-1,j,dir,grid);
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == 0)
                {
                    dfs(i,j,dir,grid);
                    count++;
                }
            }
        }
        
        return count;
    }
    public void dfs(int i,int j,int[][] dir,int[][] grid)
    {
           if(i<0 || i>=grid.length || j < 0 || j >=grid[0].length || grid[i][j] == 1 )
           {
               return;
           }
           grid[i][j] = 1;
        for(int k=0;k<4;k++)
        {
            int newR = i + dir[k][0];
            int newC = j + dir[k][1];
            
            dfs(newR,newC,dir,grid);
        }
        
    }
    
}