class Find implements Comparator<Integer>{
    
    public int compare(Integer a,Integer b)
    {
        if(a<b)
            return 1;
        else if(a > b)
            return -1;
        
        return 0;
    }
}
class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int[] cnt = new int[26];
        for(int i=0;i<tasks.length;i++)
        {
            cnt[tasks[i]-'A']++;
        }
        PriorityQueue<Integer> q = new PriorityQueue<>(new Find());
        for(int i=0;i<26;i++)
        {
            if(cnt[i] !=0)
            {
                q.add(cnt[i]);
            }
        }
        int ans = 0;
        while(!q.isEmpty())
        {
            int count = 0;
            List<Integer> temp = new ArrayList<>();
            while(count <= n)
            {
            if(q.isEmpty())
            {
                if(temp.size() > 0)
                {
                    ans = ans + (n-count + 1);
                    
                }
                break;
            }
                int x = q.poll();
                if(x-1 > 0)
                {
                    temp.add(x-1);
                }
                ans++;
                count++;
            }
            for(int i=0;i<temp.size();i++)
            {
                q.add(temp.get(i));
            }
        }
        
        return ans;
    }
}