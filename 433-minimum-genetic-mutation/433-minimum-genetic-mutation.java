class Solution {
    public int minMutation(String start, String end, String[] bank) {
        
        Set<String> set = new HashSet<>();
        if(end.equals(start))
            return 0;
        int n = bank.length;
        char[] var = {'A','C','G','T'};
        for(int i=0;i<n;i++)
        {
            String s = bank[i];
            set.add(s);
        }
        if(!set.contains(end))
            return -1;
        set.add(start);
        Queue<String> q = new LinkedList<>();
        int len = start.length();
        int level = 0;
        q.add(start);
        while(!q.isEmpty())
        {
            int p = q.size();
            while(p > 0)
            {
                char[] curWord = q.remove().toCharArray();
                for(int i=0;i<len;i++)
                {
                    char temp = curWord[i];
                    for(int j=0;j<4;j++)
                    {
                        curWord[i] = var[j];
                        String nextWord = new String(curWord);
                        if(set.contains(nextWord))
                        {
                            if(nextWord.equals(end))
                                return level+1;
                            
                            q.add(nextWord);
                            set.remove(nextWord);
                        }
                    }
                    curWord[i] = temp;
                }
                p--;
            }
            level++;
            
        }
        
        return -1;
        
    }
}