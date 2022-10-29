class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        Map<Integer,Map<Integer,Integer>> mp = new HashMap<>();
        for(int[] temp : times)
        {
            int src = temp[0];
            int dest = temp[1];
            int weight = temp[2];
            
            mp.putIfAbsent(src,new HashMap<>());
            mp.get(src).put(dest,weight);
        }
        
        int[] dis = new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y) -> x[0] - y[0]);
        dis[k] = 0;
        pq.add(new int[]{0,k});
        
        while(!pq.isEmpty())
        {
            
            int distance = pq.peek()[0];
            int node = pq.peek()[1];
            
            pq.remove();
        if(mp.containsKey(node))
        {

            for(int x: mp.get(node).keySet())
            {
                
                int adjWeight = mp.get(node).get(x);
                
                if(dis[x] > distance  + adjWeight)
                {
                    dis[x] = distance + adjWeight;
                    pq.add(new int[]{dis[x],x});
                }
            }
            
        }
        }     
        int res = Integer.MIN_VALUE;
        for(int i=1;i<=n;i++)
        {
            res = Math.max(res,dis[i]);
            //System.out.println(dis[i]);
            
        }
        
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}