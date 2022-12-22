class Solution {
    public int shortestPath(int[][] grid, int k) {
        
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int[][][] vis = new int[m][n][k+1];
        q.add(new int[]{0,0,k});
        
        int res = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                int[] p = q.remove();
                int x = p[0];
                int y = p[1];
                int z = p[2];
                
                if(x == m-1 && y== n-1 && z>=0)
                {
                    System.out.println("hello");
                    return res;
                }
                if(z < 0 || vis[x][y][z] == 1)
                {
                    continue;
                }
                vis[x][y][z] = 1;
                
                if(x-1 >= 0)
                {
                    q.add(new int[]{x-1,y,z-grid[x-1][y]});
                }
                if(x+1 < m)
                {
                    q.add(new int[]{x+1,y,z-grid[x+1][y]});
                }
                if(y-1 >= 0)
                {
                    q.add(new int[]{x,y-1,z-grid[x][y-1]});
                }
                if(y+1 < n)
                {
                    q.add(new int[]{x,y+1,z-grid[x][y+1]});
                }
             
            }
            res++;
        }
        
        return -1;
    }
}