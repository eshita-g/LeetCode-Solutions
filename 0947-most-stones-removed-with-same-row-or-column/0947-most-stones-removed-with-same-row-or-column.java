class Solution {
    public int removeStones(int[][] stones) {
        
        int n = stones.length;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++)
        {
            int[] u = stones[i];
            for(int j=0;j<n;j++)
            {
                if(i == j)
                    continue;
                
                int[] v = stones[j];
                
                if(u[0] == v[0] || u[1] == v[1])
                {
                    graph.get(i).add(j);
                }
            }
        }
        int[] vis = new int[n];
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(vis[i] == 0)
            {
                dfs(i,vis,graph);
                count++;
            }
        }
        
        return n-count;
    }
    public void dfs(int node,int[] vis,List<List<Integer>> graph)
    {
        vis[node] = 1;
        for(Integer it : graph.get(node))
        {
            if(vis[it] == 0)
            {
                dfs(it,vis,graph);
            }
        }
    }
}