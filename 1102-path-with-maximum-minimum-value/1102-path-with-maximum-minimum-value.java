class Solution {
    public int maximumMinimumPath(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int[m][n];
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> b[2] - a[2]);
        q.add(new int[]{0,0,grid[0][0]});
        int[][] dir = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
        while(!q.isEmpty())
        {
            int[] temp = q.remove();
            int x = temp[0];
            int y = temp[1];
            int z = temp[2];
            
            if(x == m-1 && y== n-1 )
                return z;
            
            vis[x][y] = 1;
            
            for(int i=0;i<4;i++)
            {
                int newR = x + dir[i][0];
                int newC = y + dir[i][1];
                
                if(newR >=0 && newR < m && newC >=0 && newC < n && vis[newR][newC] == 0)
                {
                    q.add(new int[]{newR,newC,Math.min(z,grid[newR][newC])});
                }
            }
        }
        
        return -1;
        
    }
}