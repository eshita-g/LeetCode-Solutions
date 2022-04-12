class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n > m )
           return false;
        int[] f = new int[26];
        int[] g = new int[26];
        for(int i=0;i<n;i++)
        {
            f[s1.charAt(i) - 'a']++;
            g[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(f,g))
            return true;    
        for(int i=n;i<m;i++)
        {
            g[s2.charAt(i) - 'a']++;
            g[s2.charAt(i-n) - 'a']--;
            if(Arrays.equals(f,g))
                return true;
        }
           
        
        return false;
        
    }
}