class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length(), l2 = text2.length();
       int[][] ans = new int[l1+1][l2+1];
        for(int i=0;i<=l1;i++)
        {
            for(int j=0;j<=l2;j++)
            {
                ans[i][j] = 0;
            }
        }
        for(int i=1;i<=l1;i++)
        {
            for(int j=1;j<=l2;j++)
            {
                if(text1.charAt(i-1) == text2.charAt(j-1))
                {
                    ans[i][j] = 1 + ans[i-1][j-1];
                }
                else
                {
                    ans[i][j] = Math.max(ans[i-1][j], ans[i][j-1]);
                }
            }
        }
        
        return ans[l1][l2];
    }
    
}