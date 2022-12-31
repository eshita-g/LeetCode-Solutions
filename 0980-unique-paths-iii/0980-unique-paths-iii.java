class Solution {
    public int countPaths(int[][] vis,int[][] grid,int i,int j,int c)
    {
        if(i<0||j<0||i>=grid.length||j>=grid[0].length){
            return 0;
        }
        if(vis[i][j] == 1 || grid[i][j] == -1 || c<0)
            return 0;

        if(c ==1  && grid[i][j] == 2)
        {
            return 1;
        }
        vis[i][j] = 1;
        
    
            int sum = countPaths(vis,grid,i,j+1,c-1) + countPaths(vis,grid,i+1,j,c-1) + countPaths(vis,grid,i-1,j,c-1) + countPaths(vis,grid,i,j-1,c-1);
            
            
        
        vis[i][j] = 0;
        
        return sum;

    }
    public int uniquePathsIII(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int[m][n];
        int srci = 0,srcj = 0;
        int c = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == 1)
                {
                    srci = i;
                    srcj = j;
                }
                if(grid[i][j] != -1)
                    c++;
            }
        }
        System.out.println(srci);
        return countPaths(vis,grid,srci,srcj,c);
    }
}