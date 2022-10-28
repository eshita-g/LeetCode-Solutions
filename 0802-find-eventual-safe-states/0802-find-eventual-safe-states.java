class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        
        int n = graph.length;
        int[] vis = new int[n];
        for(int i=0;i<n;i++)
        {
            if(vis[i] == 0)
            {
                dfs(i,vis,graph);
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(vis[i] == 2)
            {
                res.add(i);
            }
        }
        
        return res;
        
        
    }
    public boolean dfs(int node,int[] vis,int[][] graph)
    {
        if(vis[node] == 1)
            return true;
        
        if(vis[node] == 2)
        {
            return false;
        }
        vis[node] = 1;
        for(int i=0;i<graph[node].length;i++)
        {
            int x = graph[node][i];
            if(dfs(x,vis,graph))
            {
                return true;
            }
        }
        vis[node] = 2;
        
        return false;
    }
}