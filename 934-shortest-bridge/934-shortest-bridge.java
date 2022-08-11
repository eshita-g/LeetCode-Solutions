class Solution {
    public int shortestBridge(int[][] grid) {
        int n = grid.length;
        int[][] vis = new int[n][n];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                vis[i][j] = -1;
            }
        }
        int[][] dir = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
        int count = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(count == 0 && grid[i][j] == 1)
                {
                    dfs(i,j,grid,dir,q,vis);
                    count++;
                }
            }
        }
        while(!q.isEmpty())
        {
            int[] p = q.remove();
            for(int i=0;i<4;i++)
            {
                int x = p[0] + dir[i][0];
                int y = p[1] + dir[i][1];
                if(x >= 0 && x < n && y>=0 && y<n && vis[x][y] == -1)
                {
                    if(grid[x][y] == 1)
                        return vis[p[0]][p[1]];
                    else
                    {
                        vis[x][y] = 1 + vis[p[0]][p[1]];
                        q.add(new int[]{x,y});
                    }
                }
            }
        }
        
        return -1;
        
    }
    public void dfs(int i,int j,int[][] grid,int[][] dir,Queue<int[]> q,int[][] vis)
    {
        vis[i][j] = 0;
        q.add(new int[]{i,j});
        for(int k=0;k<4;k++)
        {
            int x = i + dir[k][0];
            int y = j + dir[k][1];
            if(x >= 0 && x < grid.length && y >=0 &&  y < grid.length && grid[x][y] == 1 && vis[x][y] == -1)
            {
                dfs(x,y,grid,dir,q,vis);
            }
        }
    }
}