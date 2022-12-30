class Solution {
    public int mostBooked(int k, int[][] meetings) {
        
      int n = meetings.length;
      Arrays.sort(meetings,(a,b) -> a[0] - b[0]);
      PriorityQueue<Integer> rooms = new PriorityQueue<>();
      for(int i=0;i<k;i++)
      {
          rooms.add(i);
      }
      PriorityQueue<int[]> allocated = new PriorityQueue<>((a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
      int[] usedRoom = new int[k];
      for(int[] task: meetings)
      {
          int start = task[0];
          int end = task[1];
          int duration = task[1] - task[0];
          
          while(!allocated.isEmpty() && allocated.peek()[0] <= start)
          {
              int[] endMeeting = allocated.remove();
              int room = endMeeting[1];
              rooms.add(room);
          }
          if(!rooms.isEmpty())
          {
              int room = rooms.remove();
              usedRoom[room]++;
              
              int[] newMeeting = new int[]{end,room};
              allocated.add(newMeeting);
          }
          else
          {
              int[] firstEndMeeting = allocated.remove();
              int endTiming = firstEndMeeting[0];
              int room = firstEndMeeting[1];
              
              usedRoom[room]++;
              
              int[] newMeeting = new int[]{duration + endTiming, room };
              
              allocated.add(newMeeting);
              
          }
      }
      int res = 0;
      for(int i=0;i<k;i++)
      {
          if(usedRoom[i] > usedRoom[res])
          {
              res = i;
          }
      }
        
        return res;
    }
}