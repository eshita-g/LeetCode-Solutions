class Solution {
    public int orangesRotting(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int[][] dir = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int time = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == 2)
                {
                    q.add(new int[] {i,j});
                }
                if(grid[i][j] == 1)
                {
                    fresh++;
                }
            }
        }
        while(!q.isEmpty() && fresh != 0)
        {
            int p = q.size();
            while(p > 0)
            {
                int[] cur =q.remove();
                for(int i=0;i<4;i++)
                {
                    int x = cur[0] + dir[i][0];
                    int y = cur[1] + dir[i][1];
                    if(x >=0 && x < m && y>=0 && y<n && grid[x][y] != 0 && grid[x][y] != 2)
                    {
                        grid[x][y] = 2;
                        q.add(new int[] {x,y});
                        fresh--;
                    }
                        
                    
                }
                p--;
            }
            time++;
        }
        
        if(fresh != 0)
            return -1;
        
        return time;
        
    }
}