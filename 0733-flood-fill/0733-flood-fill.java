class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if(image.length == 0 || image[sr][sc] == color)
            return image;
        int m = image.length;
        int n = image[0].length;
        int[][] dir = new int[][]{{0,1},{0,-1},{-1,0},{1,0}};
        int col = image[sr][sc];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr,sc});
        while(!q.isEmpty())
        {
            int[] r = q.remove();
            image[r[0]][r[1]] = color;
            for(int i=0;i<4;i++)
            {
                int x = r[0] + dir[i][0];
                int y = r[1] + dir[i][1];
                if(x >= 0 && x < image.length && y >=0 && y < image[0].length && image[x][y] == col)
                {
                    image[x][y] = color;
                    q.add(new int[]{x,y});
                }
            }
            
             
        }
        
        return image;
        
    }
}