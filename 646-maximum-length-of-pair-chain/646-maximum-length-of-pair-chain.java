class Find implements Comparator<int[]>{
    
    public int compare(int[] a,int[] b)
    {
        if(a[0] > b[0])
            return 1;
        else if(a[0] < b[0])
            return -1;
        else
            return 0;
            
    }
}
class Solution {
    public int findLongestChain(int[][] pairs) {
        
        Arrays.sort(pairs,new Find());
        int n = pairs.length;
        int[] dp = new int[n];
        int res = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            dp[i] = 1;
            for(int j=0;j<i;j++)
            {

                if(pairs[i][0] > pairs[j][1])
                {
                    dp[i] = Math.max(dp[i],1+dp[j]);
                }
            }
            res = Math.max(res,dp[i]);
        }
            
        return res;
        
    }
}