class Solution {
    boolean isValid(int code,int l)
    {
        if(l == 1)
            return code <= 9 && code >= 1;
        return code >= 10 && code <= 26;
    }
    public int numDecodings(String s) {
        int n = s.length();
        int[] ans = new int[n];
        ans[0] = isValid(s.charAt(0) - '0' , 1) ? 1 : 0;
        if(n == 1)
            return ans[0];
        ans[1] = 0;
        if(isValid(s.charAt(1) - '0' , 1))
        {
            ans[1] += ans[0];
        }
        if(isValid( (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0'), 2))
        {
            ans[1] = ans[1] + 1;
        }
        for(int i=2;i<n;i++)
        {
            ans[i] = 0;
            if(isValid(s.charAt(i) - '0',1))
            {
                ans[i] = ans[i] + ans[i-1];
            }
            if(isValid((s.charAt(i-1) - '0') * 10 +  (s.charAt(i) - '0'),2 ))
            {
                ans[i] = ans[i] + ans[i-2];
            }
        }
        
        return ans[n-1];
    }
}