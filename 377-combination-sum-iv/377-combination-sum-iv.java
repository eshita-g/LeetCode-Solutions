class Solution {
    public int combinationSum4(int[] nums, int target) {
        
        int[] dp = new int[target+1];
        Arrays.sort(nums);
        dp[0] = 1;
        for(int i=1;i<=target;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i>= nums[j])
                {
                    dp[i] = dp[i] + dp[i - nums[j]];
                }
                else
                {
                    break;
                }
            }
        }
        
        return dp[target];
        
    }
}