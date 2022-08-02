class Solution {
    public int bfs(int[][] grid,int i,int j)
    {
        Queue<int[]> q = new LinkedList<>();
        int per = 0;
        int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        q.add(new int[]{i,j});
        grid[i][j] = -1;
        while(!q.isEmpty())
        {
            int[] cur = q.remove();
            for(int[] d:dir)
            {
                int x = cur[0] + d[0];
                int y = cur[1] + d[1];
                if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || grid[x][y] == 0 )
                {
                    per++;
                }
                else if(grid[x][y] == 1)
                {
                    q.add(new int[]{x,y});
                    grid[x][y] = -1;
                }
            }
        }
        return per;
    }
    public int islandPerimeter(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == 1)
                    return bfs(grid,i,j);
            }
        }
        
        return 0;
        
    }
}