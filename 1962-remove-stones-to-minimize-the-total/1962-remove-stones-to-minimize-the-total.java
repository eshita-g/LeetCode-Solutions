class Solution {
    public int minStoneSum(int[] piles, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (b-a));
        for(int x : piles){
            pq.add(x);
        }
        while(k>0 && pq.size() > 0){
            int val = pq.poll();
            val = val - (int)Math.floor(val/2);
            pq.add(val);
            k--;
            
        }
        int res = 0;
        if(pq.size() > 0){
            while(pq.size() > 0){
                int p = pq.poll();
                res = res + p;
            }
        }
        return res;
        
    }
}