class Solution {
    
    boolean cycle = false;
    public void dfs(int node,int prevNode,int[] vis,ArrayList<ArrayList<Integer>> graph)
    {
        if(vis[node] == 1)
        {
            cycle = true;
            return;
            
        }
        vis[node] = 1;
        for(Integer it: graph.get(node))
        {
            if(it == prevNode)
            {
                continue;
            }
            dfs(it,node,vis,graph);
        }
    }
    
    public boolean validTree(int n, int[][] edges) {
        
        int[] vis = new int[n];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0;i<edges.length;i++)
        {
            int src = edges[i][0];
            int des = edges[i][1];
            
            graph.get(src).add(des);
            graph.get(des).add(src);
        }
        dfs(0,-1,vis,graph);
        
        if(cycle == true)
        {
            return false;
        }
        for(int i=0;i<n;i++)
        {
            if(vis[i] == 0)
            {
                return false;
            }
        }
        
        return true;
    }
}