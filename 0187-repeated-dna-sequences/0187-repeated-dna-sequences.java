class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        List<String> res = new ArrayList<>();
        HashMap<String,Integer> mp = new HashMap<>();
        int n = s.length();
        int left = 0;
        int right = 9;
        while(right < n)
        {
            if(right-left+1 > 10)
            {
                left++;
            }
            if(right-left+1 == 10)
            {
                String str = s.substring(left,right+1);
                mp.put(str,mp.getOrDefault(str,0) + 1);
            }
            right++;
            
        }
        for(String key : mp.keySet())
        {
            if(mp.get(key) > 1)
            {
                res.add(key);
            }
        }
        
        return res;
        
    }
}