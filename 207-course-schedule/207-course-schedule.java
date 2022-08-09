class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        
        int[] indeg = new int[n];
        for(int pre[] : prerequisites)
        {
            indeg[pre[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(indeg[i] == 0)
            {
                q.add(i);
            }
        }
        ArrayList<Integer> top = new ArrayList<>();
        if(q.isEmpty())
            return false;
        while(!q.isEmpty())
        {
            int x = q.remove();
            top.add(x);
            for(int pre[] : prerequisites)
            {
                if(pre[1] == x)
                {
                    indeg[pre[0]]--;
                 if(indeg[pre[0]] == 0)
                  {
                    q.add(pre[0]);
                  }
                }
                
            }
            
            
        }
        if(top.size() != n)
            return false;
        
        return true;
        
        
        
    }
}