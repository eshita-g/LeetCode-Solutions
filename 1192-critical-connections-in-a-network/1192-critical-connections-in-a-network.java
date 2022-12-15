class Solution {
    private int timer = 1;
    public void dfs(int node,int par,ArrayList<ArrayList<Integer>> graph,int[] vis,int[] dis,int[] low,List<List<Integer>> bridges)
    {
         vis[node] = 1;
         low[node] = timer;
         dis[node] = timer;
         timer++;
         for(Integer it : graph.get(node))
         {
             if(it == par)
             {
                 continue;
             }
             if(vis[it] == 0)
             {
                 dfs(it,node,graph,vis,dis,low,bridges);
                 low[node] = Math.min(low[node],low[it]);
                 if(low[it] > dis[node])
                 {
                     bridges.add(Arrays.asList(node,it));
                 }
             }
             else
             {
                 low[node] = Math.min(low[node],dis[it]);
             }

         } 
 
    }
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0;i<connections.size();i++)
        {
            int u = connections.get(i).get(0);
            int v = connections.get(i).get(1);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        int[] vis = new int[n];
        int[] dis = new int[n];
        int[] low = new int[n];
        List<List<Integer>> bridges = new ArrayList<>();
        dfs(0,-1,graph,vis,dis,low,bridges);
        return bridges;



        
    }
}