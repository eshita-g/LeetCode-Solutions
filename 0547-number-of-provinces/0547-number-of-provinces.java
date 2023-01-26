class Solution {
    public void dfs(int node,ArrayList<ArrayList<Integer>> graph,int[] vis)
    {
        vis[node] = 1;
        
        for(Integer it: graph.get(node))
        {
            if(vis[it] == 0)
            {
                dfs(it,graph,vis);
            }
        }
        
    }
    public int findCircleNum(int[][] isConnected) {
        
        int n = isConnected.length;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j && isConnected[i][j] == 1)
                {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
        int[] vis = new int[n];
        int c = 0;
        for(int i=0;i<n;i++)
        {
           
            if(vis[i] == 0)
            {
                dfs(i,graph,vis);
                c++;
            }
            
        }
        
        return c;
        
    }
}