class Solution {
    public void dfs(int i,int j,int prev,boolean[][] ocean,int[][] heights)
    {
        if(i<0 || i>=ocean.length || j<0 || j>=ocean[0].length)
            return;
        
        if(prev > heights[i][j] || ocean[i][j])
            return;
        
        
        ocean[i][j] = true;
        
        
        dfs(i+1,j,heights[i][j],ocean,heights);
        dfs(i-1,j,heights[i][j],ocean,heights);
        dfs(i,j+1,heights[i][j],ocean,heights);
        dfs(i,j-1,heights[i][j],ocean,heights);
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        List<List<Integer>> res = new ArrayList<>();
        int m = heights.length;
        int n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        for(int i=0;i<m;i++)
        {
            dfs(i,0,Integer.MIN_VALUE,pacific,heights);
            dfs(i,n-1,Integer.MIN_VALUE,atlantic,heights);

            
        }
        for(int j=0;j<n;j++)
        {
            dfs(0,j,Integer.MIN_VALUE,pacific,heights);
            dfs(m-1,j,Integer.MIN_VALUE,atlantic,heights);


        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(atlantic[i][j] && pacific[i][j])
                {
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        
        return res;
    }
}