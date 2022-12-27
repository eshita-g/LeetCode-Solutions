class Solution {
    public int minMeetingRooms(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int count = 1;
        for(int i=0;i<intervals.length;i++)
        {
            if(!q.isEmpty())
            {
                int temp = q.peek();
                if(temp > intervals[i][0])
                {
                    count++;
                }
                else
                {
                    q.remove();
                }
            }
            q.add(intervals[i][1]);

        }
        
        return count;
    }
}