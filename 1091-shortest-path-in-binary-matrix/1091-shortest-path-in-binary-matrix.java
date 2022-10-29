class Solution { 
    public int shortestPathBinaryMatrix(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int[][] dis = new int[m][n];
        for(int[] i : dis)
        {
            Arrays.fill(i, Integer.MAX_VALUE);
        }
        
        Queue<int[]> pq = new LinkedList<>();
        if(grid[0][0] == 1)
            return -1;
        pq.add(new int[]{0,0,0});
        dis[0][0] = 0;
        int[][] dir = new int[][]{{-1,0},{1,0},{0,1},{0,-1},{-1,1},{1,1},{-1,-1},{1,-1}};
        while(!pq.isEmpty())
        {
            int[] arr = pq.remove();
            int distance = arr[0];
            int r = arr[1];
            int c = arr[2];
            
            for(int i=0;i<8;i++)
            {
                int newr = r + dir[i][0];
                int newc = c + dir[i][1];
                
                if(newr >=0 && newr < grid.length && newc >= 0 && newc < grid[0].length && grid[newr][newc] == 0 && distance + 1 < dis[newr][newc])
                {
                    dis[newr][newc] = 1 + distance;
                    pq.add(new int[]{1+distance,newr,newc});
                }
            }
        }
        
        return dis[m-1][n-1] == Integer.MAX_VALUE ? -1 : dis[m-1][n-1] + 1;
    }
}