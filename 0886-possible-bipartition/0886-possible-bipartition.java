class Solution {
    boolean bipartite = true;
    public void dfs(int node,ArrayList<ArrayList<Integer>> graph,int[] vis,int[] col,int color)
    {
        if(vis[node] == 1)
        {
            if(col[node] != color)
            {
                bipartite = false;
                
            }
            return;
        }
        vis[node] = 1;
        col[node] = color;
        int adjColor = color == 1 ? 0 : 1;
        for(Integer it : graph.get(node))
        {
            dfs(it,graph,vis,col,adjColor);
        }
    }
    public boolean possibleBipartition(int n, int[][] dislikes) {
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0;i<dislikes.length;i++)
        {
            int src = dislikes[i][0];
            int des = dislikes[i][1];
            
            graph.get(src).add(des);
            graph.get(des).add(src);
        }
        int[] vis = new int[n+1];
        int[] col = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            if(vis[i] == 0)
            {
                dfs(i,graph,vis,col,0);
            }
        }
        
        return bipartite;
    }
}