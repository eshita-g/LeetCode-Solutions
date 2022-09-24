class Solution {
    public int strStr(String haystack, String needle) {
        
        int n1 = needle.length();
        int n2 = haystack.length();
        for(int i=0;i<n2;i++)
        {
        
            if(haystack.charAt(i) ==  needle.charAt(0))
            {
                int k = i;
                int j = 0;
                while(k< n2 && haystack.charAt(k) == needle.charAt(j))
                {
                    k++;
                    j++;
                    
                    if(j == n1)
                    {
                        return i;
                    }
                }
            }
        }
        
        return -1;
    }
}