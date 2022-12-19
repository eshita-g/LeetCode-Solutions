class Solution {
    boolean  res = false;
    public void dfs(int src,int dest,int[] vis,HashMap<Integer,List<Integer>> graph)
    {
          vis[src] = 1;
          for(Integer it : graph.get(src))
          {
              if(it == dest)
              {
                  res = true;
                  return;
              }
              if(vis[it] == 0)
              {
                  dfs(it,dest,vis,graph);
              }
          }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        int[] vis = new int[n];
        HashMap<Integer,List<Integer>> graph = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            graph.put(i,new ArrayList<>());
        }
        for(int[] edge : edges)
        {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        if(source == destination)
        {
            res = true;
        }
        dfs(source,destination,vis,graph);
        
        return res;
        
    }
}