class Solution {
    public int find(int i,int[] parent)
    {
        while(parent[i] != i)
        {
            i = parent[i];
        }
        
        return i;
    }
    public void union(int u,int v,int[] parent,int[] size)
    {
        u = find(u,parent);
        v = find(v,parent);
        
        if(size[u] > size[v])
        {
            parent[v] = u;
            size[u] = size[v] + size[u];
        }
        else
        {
            parent[u] = v;
            size[v] = size[u] + size[v];
        }
    }
    public int earliestAcq(int[][] logs, int n) {
        
        int[] parent = new int[n];
        int[] size = new int[n];
        for(int i=0;i<n;i++)
        {
            parent[i] = i;
            size[i] = 1;
        }
        
        Arrays.sort(logs,(a,b) -> a[0]-b[0]);
        for(int[] temp : logs)
        {
            if(find(temp[1],parent) != find(temp[2],parent))
            {
                union(temp[1],temp[2],parent,size);
                n--;
                
                
            }
            if(n==1)
            {
                return temp[0];
            }
        
        }
        
        return -1;
    }
}