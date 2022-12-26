class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        
        int[][] players = new int[n][2];
        for(int i=0;i<n;i++)
        {
            players[i][0] = efficiency[i];
            players[i][1] = speed[i];
        }
        Arrays.sort(players,(a,b) -> b[0] - a[0]);
        PriorityQueue<Integer> q = new PriorityQueue<>();
        long res = 0;
        long sum = 0;
        int mod = 1000000007;
        for(int i=0;i<n;i++)
        {
            q.add(players[i][1]);
            sum = sum + players[i][1];
            if(q.size() > k)
            {
                sum = sum - q.remove();
            }
            
            res = Math.max(res, sum*players[i][0]);
        }
        
        return (int) (res % mod);
    }
}