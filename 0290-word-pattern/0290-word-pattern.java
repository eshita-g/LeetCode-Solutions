class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String> mp = new HashMap<>();
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length)
            return false;
        for(int i=0;i<pattern.length();i++)
        {
            if(mp.containsKey(pattern.charAt(i)))
            {
                if(!mp.get(pattern.charAt(i)).equals(arr[i]))
                {
                    return false;
                }
                
            }
            else
            {    
                    mp.put(pattern.charAt(i),arr[i]);
            }    
        
        }
        HashSet<String> set = new HashSet<>();
        for(char key : mp.keySet())
        {
            if(set.contains(mp.get(key)))
                return false;
            set.add(mp.get(key));
        }
        return true;
    }
}