class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n==0)
            return 0;
        int global = 0;
        HashSet<Character> res = new HashSet<>();
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(!res.contains(s.charAt(i)))
            {
                res.add(s.charAt(i));
                global = Math.max(global,res.size());
            }
            else
            {
                res.remove(s.charAt(j));
                i--;
                j++;
            }
        }
        
        
        return global;
        
        
    }
}