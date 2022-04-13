class Solution {
    public boolean isAnagram(String s, String t) {
        
       int[] a = new int[26];
       int[] b = new int[26];
       for(int i=0;i<s.length();i++)
       {
           a[s.charAt(i) - 'a']++;
       }
        for(int i=0;i<t.length();i++)
        {
            b[t.charAt(i) - 'a']++;
        }
        if(Arrays.equals(a,b))
            return true;
        
        return false;
    }
}