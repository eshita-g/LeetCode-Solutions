class Solution {
    int count = 0;
    public int dp(int i,int amount,int[][] res,int[] coins)
    {
        
        if(amount == 0)
            return 1;
        if(amount < 0)
            return 0;
        
        if(i < 0)
            return 0;
        
        if(res[i][amount] != -1)
            return res[i][amount];
        
        res[i][amount] = dp(i,amount - coins[i],res,coins) + dp(i-1,amount,res,coins);
        
        return res[i][amount];
        
         
        
    }
    public int change(int amount, int[] coins) {
        
        int[][] res = new int[coins.length][amount+1];
        for(int[] row : res)
        {
            Arrays.fill(row,-1);
        }
        return dp(coins.length-1,amount,res,coins);
    }
}