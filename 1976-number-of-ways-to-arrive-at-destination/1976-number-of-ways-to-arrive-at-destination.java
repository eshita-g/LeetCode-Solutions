class Solution {
    public int countPaths(int n, int[][] roads) {
        
        HashMap<Integer,Map<Integer,Integer>> mp = new HashMap<>();
        for(int[] temp : roads)
        {
            int src = temp[0];
            int des = temp[1];
            int w = temp[2];
            
            mp.putIfAbsent(src,new HashMap<>());
            mp.get(src).put(des,w);
            mp.putIfAbsent(des,new HashMap<>());
            mp.get(des).put(src,w);
        }
        int[] dis = new int[n];
        long[] ways = new long[n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        pq.add(new int[]{0,0});
        dis[0]= 0;
        ways[0] = 1;
        while(!pq.isEmpty())
        {
            int distance = pq.peek()[0];
            int node  = pq.peek()[1];
            pq.remove();
            if(distance > dis[node]) 
                continue;

            if(mp.containsKey(node))
            {    
            for(int x : mp.get(node).keySet())
            {
                System.out.println(x);
                int adjWeight = mp.get(node).get(x);
                
                if(distance + adjWeight < dis[x])
                {
                    dis[x] = distance + adjWeight;

                    pq.add(new int[]{dis[x],x});
                    ways[x] = ways[node];
                }
                else if(distance + adjWeight == dis[x])
                {
                    ways[x] = (ways[x] + ways[node]) % 1000000007;
                    

                    
                }

            
            }
            }    
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(ways[i] + " ") ;
        }
        
        return (int)ways[n-1] % 1000000007;
    }
} 