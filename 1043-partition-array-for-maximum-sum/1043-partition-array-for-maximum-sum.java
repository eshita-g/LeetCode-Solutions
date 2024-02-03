class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        
        return maxSum(0,k,arr,dp);
         
    }
    
    public int maxSum(int start,int k,int[] arr,int[] dp){
        
        int n = arr.length;
        
        if(start >= n)
            return 0;
        if(dp[start] != -1)
            return dp[start];
        
        int curMax = 0;
        int ans = 0;
        int len = 0;
        int end = Math.min(n,start+k);
        for(int i=start;i<end;i++){
            curMax  = Math.max(arr[i],curMax);
            len++;
            
            ans = Math.max(ans, curMax*len + maxSum(i+1,k,arr,dp));
        }
        dp[start] = ans;
        return dp[start];
    }
}