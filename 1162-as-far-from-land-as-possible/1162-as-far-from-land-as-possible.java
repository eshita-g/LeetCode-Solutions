class Node{
    
    int x;
    int y;
    int d;
    Node(int x,int y,int d)
    {
        this.x = x;
        this.y = y;
        this.d = d;
    }
}
class Solution {
    public int maxDistance(int[][] grid) {
        
        Queue<Node> q = new LinkedList<>();
        int flag = 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 1)
                {
                    q.add(new Node(i,j,0));
                }
                else{
                    
                    flag = 1;
                }
            }
        }
        if(q.isEmpty() || flag == 0)
            return -1;
        
        int[][] dir = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        int res = Integer.MIN_VALUE;
        while(!q.isEmpty())
        {
            Node p = q.remove();
            int x = p.x;
            int y = p.y;
            int d = p.d;
            res = Math.max(res,d);
            for(int i=0;i<4;i++)
            {
                int r = x + dir[i][0];
                int c = y + dir[i][1];
                if(r >=0 && r<grid.length && c >= 0 && c< grid[0].length && grid[r][c] == 0)
                {
                    grid[r][c] = 1;
                    q.add(new Node(r,c,d+1));
                }
            }
        }
        
        return res;
        
    }
}