class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        Set <String> set = new HashSet<>(wordList);
        if(!set.contains(endWord))
            return 0;
        Queue<String> q = new LinkedList<>();
        int level = 1;
        int len = beginWord.length();
        q.add(beginWord);
        while(!q.isEmpty())
        {
            int p = q.size();
            while(p > 0)
            {
                char[] curWord = q.remove().toCharArray();
                for(int i=0;i<len;i++)
                {
                    char temp = curWord[i];
                    for(char c='a';c<='z';c++)
                    {
                        curWord[i] = c;
                        String nextWord = new String(curWord);
                        if(set.contains(nextWord))
                        {
                            if(nextWord.equals(endWord))
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
        return 0;
        
    }
}