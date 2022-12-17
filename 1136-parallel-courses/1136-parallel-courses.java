class Solution {
    public int minimumSemesters(int n, int[][] relations) {
        
        int[] indegree = new int[n+1];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0;i<relations.length;i++)
        {
            int src= relations[i][0];
            int des = relations[i][1];
            
            graph.get(src).add(des);
        }
        for(int i=1;i<=n;i++)
        {
            for(Integer it : graph.get(i))
            {
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++)
        {
            if(indegree[i] == 0)
            {
                q.add(i);
            }
        }
        int count = 0;
        int vertices = n;
        while(!q.isEmpty())
        {
            int t = q.size();
            System.out.println(count);
            ;
            count++;
            while(t > 0)
            {
                int x = q.remove();
                vertices--;
                for(Integer it: graph.get(x))
                {
                    indegree[it]--;
                    if(indegree[it] == 0)
                    {
                        q.add(it);
                    }
                }
                t--;
            }
        }
        return vertices!=0 ? -1 : count;
    }
}