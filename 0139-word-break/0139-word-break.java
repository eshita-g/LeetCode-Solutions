class Solution {
    boolean flag = false;
    public boolean wordBreak(String s, List<String> wordDict) {
        
        HashSet<String> set = new HashSet<>(wordDict);
        int n = s.length();
        int[] dp = new int[n+1];
        helper(0,s,set,dp);
        
        return flag;
    }
    
    public void helper(int start,String s,HashSet<String> set,int[] dp)
    {
        if(start > s.length()-1)
        {
            flag = true;
            return;
        }
        for(int i=start;i<s.length();i++)
        {
            if(set.contains(s.substring(start,i+1)) && dp[i+1]!=2)
            {
                dp[start] = 1;
                helper(i+1,s,set,dp);
            }
            if(i >= s.length() - 1)
            {
                dp[start] = 2;
                return;
            }
        }
        
        return;
    }
}