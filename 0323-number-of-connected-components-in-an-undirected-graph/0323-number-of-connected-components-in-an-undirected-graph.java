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
    public int countComponents(int n, int[][] edges) {
        
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
        int count = 0;
        int[] vis = new int[n];
        for(int i=0;i<n;i++)
        {
            if(vis[i] == 0)
            {
                dfs(i,graph,vis);
                count++;
            }
        }
        
        return count;
        
    }
}