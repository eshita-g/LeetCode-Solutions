class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] cnt = new int[n];
        int res = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0;i<n;i++)
        {
            dp[i] = 1;
            cnt[i] = 1;
        }
        for(int i=0;i<n;i++)
        {
            dp[i] = 1;
            for(int j=0;j<i;j++)
            {
                if(nums[i] > nums[j])
                {
                    if(dp[i] == dp[j] + 1)
                    {
                        cnt[i] = cnt[j] + cnt[i];
                    }
                    else if(dp[j] + 1 > dp[i])
                    {
                        dp[i] = dp[j] + 1;
                        cnt[i] = cnt[j];
                    }
                }
                
            }
            res = Math.max(res,dp[i]);
        }
        
        for(int i=0;i<n;i++)
        {
            if(dp[i] == res)
            {
                count = count + cnt[i];
            }
        }
        
        return count;
    }
}