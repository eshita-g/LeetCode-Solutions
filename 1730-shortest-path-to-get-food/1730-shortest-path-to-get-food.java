class Solution {
    public int getFood(char[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == '*')
                {
                    q.add(new int[]{i,j});
                    break;
                }
            }
        }
        int res = 0;
        int[][] vis = new int[m][n];
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {

                int[] p = q.remove();
                
                int x = p[0];
                int y = p[1];
                //System.out.println(x+""+y);
                
                if(grid[x][y] == '#')
                {
                    //System.out.println("hi");
                    return res;
                }
                if(vis[x][y] == 1)
                    continue;
                
                vis[x][y] = 1;
                
                if(x-1 >= 0 && grid[x-1][y] != 'X')
                {
                    q.add(new int[]{x-1,y});
                }
                if(x+1 < m && grid[x+1][y] != 'X')
                {
                    q.add(new int[]{x+1,y});
                }
                if(y-1 >=0 && grid[x][y-1] != 'X')
                {
                    q.add(new int[]{x,y-1});
                }
                if(y+1 < n && grid[x][y+1] != 'X')
                {
                    q.add(new int[]{x,y+1});
                }
            
            }
            
            res++;
        }
        
        return -1;
    }
}