class Solution {
    
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        long[] ans = new long[amount + 1];
        Arrays.fill(ans,0,amount + 1,-1);
        ans[0] = 0;
        for(int i=1;i<=amount;i++)
        {
            ans[i] = Integer.MAX_VALUE;
            for(int j=0;j<n;j++)
            {
                if(coins[j] <= i)
                 ans[i] = Math.min(ans[i], 1 + ans[i - coins[j]]);
            }
        }
        if(ans[amount] >= Integer.MAX_VALUE)
        {
            return -1;
        }
        
        return (int)ans[amount];
        
        
    }
}