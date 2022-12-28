class Solution {
    public int minDeletions(String s) {
        
        int n = s.length();
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i),0) + 1);
        }
        
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(Character it: mp.keySet())
        {
            int val = mp.get(it);
            
            if(!set.contains(val))
            {
                set.add(val);
            }
            else
            {
               while(val > 0 && set.contains(val))
               {
                   val--;
                   count++;
               }
               if(val > 0)
               {
                   set.add(val);
               }
            }
        }
        
        return count;
        
    }
}