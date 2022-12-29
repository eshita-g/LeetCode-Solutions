class Task{
    
    int enq;
    int process;
    int idx;
    
    Task(int enq,int process,int idx)
    {
        this.enq = enq;
        this.process = process;
        this.idx = idx;
    }
}
class Solution {
    public int[] getOrder(int[][] tasks) {
        
        int n = tasks.length;
        Task[] taskInfo = new Task[n];
        for(int i=0;i<tasks.length;i++)
        {
            taskInfo[i] = new Task(tasks[i][0],tasks[i][1],i);
        }
        Arrays.sort(taskInfo,(a,b) -> a.enq - b.enq);
        PriorityQueue<Task> q = new PriorityQueue<>((a,b) -> {
            
            if(a.process == b.process)
            {
                return a.idx-b.idx;
            }
            
            return a.process-b.process;
        });
        int[] ans = new int[n];
        int ansIdx = 0;
        int taskIdx = 0;
        int curTime = 0;
        while(ansIdx < n)
        {
            while(taskIdx < n && taskInfo[taskIdx].enq <= curTime )
            {
                q.add(taskInfo[taskIdx]);
                taskIdx++;
            }
            if(q.isEmpty())
            {
                curTime = taskInfo[taskIdx].enq;
                
            }
            else
            {
                curTime = curTime + q.peek().process;
                ans[ansIdx++] = q.peek().idx;
                q.remove();
            }
        }
        
        return ans;
        
    }
}