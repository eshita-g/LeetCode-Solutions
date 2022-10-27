class Solution {
    int[][] dir = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
    boolean cycle = false;
    
    public boolean containsCycle(char[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(vis[i][j] == 0)
                {
                    dfs(i,j,grid,vis,-1,-1);
                }
            }
        }
        
        return cycle;
        
    }
    public void dfs(int i,int j,char[][] grid,int[][] vis,int previ,int prevj)
    {
    
                
        vis[i][j] = 1;
        for(int k=0;k<4;k++)
        {
            int x = i + dir[k][0];
            int y = j + dir[k][1];
            if(x<0 || x>=grid.length || y<0 || y>=grid[0].length ||  grid[x][y] != grid[i][j])
             {
                  continue;
             }
          
        

            if(x == previ && y == prevj)
            {
                continue;
            }
          if(vis[x][y] == 1)
          {
            cycle = true;
            return;
          }
            
            dfs(x,y,grid,vis,i,j);
        }
        
    }
}