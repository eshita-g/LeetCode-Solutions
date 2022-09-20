class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        
        List<Integer> res =  new ArrayList<>();
        if(s.length() == 0)
            return res;
        int n = words.length;
        int k = words[0].length();
        if(s.length() < (n*k))
        {
            return res;
        }
        HashMap<String,Integer> w = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            w.put(words[i],w.getOrDefault(words[i],0) + 1);
        }
        for(int i=0;i<=s.length()-n*k;i++)
        {
            HashMap<String,Integer> temp =  new HashMap<>(w);
            for(int j=i;j<i+n*k;j= j+k)
            {
                String p = s.substring(j,j+k);
                if(temp.containsKey(p))
                {
                  temp.put(p,temp.get(p) - 1);
                
                if(temp.get(p) == 0)
                {
                    temp.remove(p);
                }
                }
                    
                if(temp.size()  == 0)
                {
                                    System.out.println(temp.size());

                    res.add(i);
                }
            }
            
        }
        
        return res;
        
    }
}