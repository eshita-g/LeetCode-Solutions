class Solution {
    public void dfs(int node,int des,List<Integer> temp,List<List<Integer>> res,int[][] graph,int[] vis)
    {
        if(node == des )
        {

            temp.add(node);
            res.add(new ArrayList<>(temp));
            temp.remove(temp.size()-1);
            return;
        }
        vis[node] = 1;
        temp.add(node);

        for(int x : graph[node])
        {
            if(vis[x] ==0)
            {
                dfs(x,des,temp,res,graph,vis);
                //vis[x] = 0;
        
            }
        }
        vis[node] = 0;
        temp.remove(temp.size() -1);
        
        
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        int n = graph.length;
        int[] vis = new int[n];
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        
        dfs(0,n-1,temp,res,graph,vis);
        
        return res;
        
    }
}