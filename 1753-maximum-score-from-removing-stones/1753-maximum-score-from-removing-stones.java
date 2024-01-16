class Solution {
    public int maximumScore(int a, int b, int c) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y) -> (y-x));
        pq.add(a);
        pq.add(b);
        pq.add(c);
        int result = 0;
        while(pq.size() > 1){
            
            int x = pq.poll();
            int y = pq.poll();
            
            x--;
            y--;
            
            if(x!= 0 && y!=0){
                pq.add(x);
                pq.add(y);
            }else if(x!=0){
                pq.add(x);
            }else if(y!=0){
                pq.add(y);
            }
            
            result++;
            
        }
        
        return result;
    }
}