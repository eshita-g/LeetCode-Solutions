class Solution {
    public int numIslands(char[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int dir[][] = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        int count = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == '1')
                {
                    dfs(i,j,dir,grid);
                    count++;
                }
            }
        }
        
        return count;
        
    }
    public void dfs(int i,int j,int[][] dir,char[][] grid)
    {
    
        if(i < 0 || i>= grid.length || j<0 || j>=grid[0].length || grid[i][j] == '0')
            return;
        
        grid[i][j] = '0';
        for(int k=0;k<4;k++)
        {
            dfs(i + dir[k][0], j+dir[k][1], dir,grid);
        }
    }
    
}