class Solution {

    boolean bipartite = true;
    
    public boolean isBipartite(int[][] graph) {
        int m = graph.length;
        int n = graph[0].length;
        int[] vis = new int[m];
        for(int i=0;i<m;i++)
        {
            vis[i] = 0;
        }
        int[] col = new int[m];
        for(int i=0;i<m;i++)
        {
            if(vis[i] == 0)
            {
                dfs(i,graph,vis,col,0);
            }
        }
        
        return bipartite;
    }
    public void dfs(int i,int[][] graph,int[] vis,int[] col,int color)
    {
        if(vis[i] == 1)
        {
            if(col[i] !=  color)
            {
                bipartite = false;
            }
            return;
        }
        vis[i] = 1;
        col[i] = color;
        int adjColor = color == 0 ? 1 : 0;
        for(int j=0;j<graph[i].length;j++)
        {
            int adj = graph[i][j];
            dfs(adj,graph,vis,col,adjColor);
        }
    }
}