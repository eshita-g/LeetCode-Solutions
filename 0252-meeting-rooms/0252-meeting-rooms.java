class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        
        int n = intervals.length;
        int[] start= new int[n];
        int[] end = new int[n];
        for(int i=0;i<n;i++)
        {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        if( n == 1)
            return true;
        Arrays.sort(start);
        Arrays.sort(end);
        for(int i=1;i<n;i++)
        {
            if(start[i] < end[i-1])
                return false;
        }
        
        return true;
    }
}