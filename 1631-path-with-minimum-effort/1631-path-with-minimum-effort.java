class Solution {
    public int minimumEffortPath(int[][] heights) {
        
        int m = heights.length;
        int n = heights[0].length;
        int[][] dis = new int[m][n];
        for(int[] i: dis)
        {
            Arrays.fill(i,Integer.MAX_VALUE);
            
        }
        int[][] dir = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        dis[0][0] = 0;
        pq.add(new int[]{0,0,0});
        while(!pq.isEmpty())
        {
            int[] temp = pq.remove();
            int r = temp[1];
            int c = temp[2];
            
            for(int i=0;i<4;i++)
            {
                
                int newr = r + dir[i][0];
                int newc = c + dir[i][1];
                
                if(newr < 0 || newr >= heights.length || newc < 0 || newc >= heights[0].length)
                    continue;
                
                int val = Math.max(temp[0], Math.abs(heights[r][c] - heights[newr][newc]));
                if(val < dis[newr][newc])
                {
                    dis[newr][newc] =val;
                    pq.add(new int[]{val,newr,newc});
                }
                    
            }
            
        }
        
        return dis[m-1][n-1];
    }
}