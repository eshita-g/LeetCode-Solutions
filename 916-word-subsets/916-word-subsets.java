class Solution {
    int[] counter(String word)
    {
        int[] count = new int[26];
        for(char c: word.toCharArray())
        {
            count[c - 'a']++;
        }
        return count;
    }
    public List<String> wordSubsets(String[] words1, String[] words2) {
        
        int[] count = new int[26],temp;
        for(String b : words2)
        {
            temp = counter(b);
            for(int i=0;i<26;i++)
            {
                
                count[i] = Math.max(count[i],temp[i]);
            }
        }
        List<String> res = new ArrayList<>();
        int j;
        for(String a : words1)
        {
            temp = counter(a);
            for(j=0;j<26;j++)
            {
                if(temp[j] < count[j])
                    break;
                
                
            }
            if(j  == 26)
                res.add(a);

        }
        
        return res;
        
    }
}