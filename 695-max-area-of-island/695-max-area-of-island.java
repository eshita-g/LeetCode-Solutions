class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int[][] dir = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        int  p =0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == 1)
                {
                    p = Math.max(p, dfs(i,j,grid,dir));
                }
            }
        }
        
        return p;
        
    }
    
    public int dfs(int i,int j,int[][] grid,int[][] dir)
    {
        if(i < 0 || i >= grid.length ||  j< 0 || j >= grid[0].length || grid[i][j] == 0 || grid[i][j] == -1)
            
            return 0;
        grid[i][j] = -1;
        int x = 1;
        for(int k = 0;k<4;k++)
        {
            x = x + dfs(i+dir[k][0], j+ dir[k][1], grid,dir);
        }
        
        return x;
        
    }
}