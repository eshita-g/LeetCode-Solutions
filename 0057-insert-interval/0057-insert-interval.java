class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> res = new ArrayList<>();
        int f = 0;
        for(int i=0;i<intervals.length;i++)
        {
            if(intervals[i][0] > newInterval[0])
            {
                System.out.println("hi");
                res.add(newInterval);
                f = 1;
            }
            res.add(intervals[i]);
            
        }
        if(f==0)
        {
            res.add(newInterval);
        }
        List<int[]> answer = new ArrayList<>();
        for(int[] temp : res)
        {
            if(answer.size() ==0 || temp[0] > answer.get(answer.size() - 1)[1])
            {
                answer.add(temp);
            }
            else
            {
                int[] val = answer.get(answer.size() - 1);
                val[1] = Math.max(temp[1],val[1]);

            }
        }
        return answer.toArray(new int[answer.size()][2]);
    }
}