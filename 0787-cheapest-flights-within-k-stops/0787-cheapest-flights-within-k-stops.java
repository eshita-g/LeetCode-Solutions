class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
        Map<Integer,Map<Integer,Integer>> mp = new HashMap<>();
        for(int[] temp : flights)
        {
            int src1 = temp[0];
            int des = temp[1];
            int weight = temp[2];
            
            mp.putIfAbsent(src1,new HashMap<>());
            mp.get(src1).put(des,weight);
        }
        int[] dis = new int[n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        Queue<int[]> pq  = new LinkedList<>();
        dis[src] = 0;
        pq.add(new int[]{0,src,0});
        while(!pq.isEmpty())
        {
     
            int distance = pq.peek()[0];
            int node = pq.peek()[1];
            int stop = pq.peek()[2];
            pq.remove();    
            if(stop > k)
                continue;    
            if(mp.containsKey(node))
            {
                for(int x: mp.get(node).keySet())
                {
                    int adjWeight = mp.get(node).get(x);
                    if(dis[x] > distance + adjWeight && stop <= k)
                    {
                        dis[x] = distance + adjWeight;
                        System.out.println(dis[x]);
                        pq.add(new int[]{dis[x],x,stop+1});
                    }
                }
            }
              
     
    
        }
        
        if(dis[dst] == Integer.MAX_VALUE)
        {
            
            return -1;
        }
        
        return dis[dst];
}
}    
    