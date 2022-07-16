class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] isPal = new boolean[n][n];
        int res = 1;
        int start = 0;
        int end = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                isPal[i][j] = true;
            }
        }
        for(int d=1;d<n;d++)
        {
            int i =0;
            int j = d;
            while(i < n && j<n)
            {   
                if(s.charAt(i) == s.charAt(j))
                {    
                 isPal[i][j] = isPal[i+1][j-1];
                } 
                else
                {
                    isPal[i][j] = false;
                }
                if(isPal[i][j] == true)
                {
                    if( (j-i + 1) > res)
                    {
                        res = j-i+1;
                        start = i;
                        end = j;
                    }
                }
                i++;
                j++;
            }
        }
        StringBuilder st = new StringBuilder();
        while(start<=end)
        {
            st.append(s.charAt(start));
            start++;
        }
        
        String out = st.toString();
        
        
        return out;
    }
}