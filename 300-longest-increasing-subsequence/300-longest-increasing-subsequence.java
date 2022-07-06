class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        int[] lis = new int[n];
        int res = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            lis[i] = 1;
            for(int j=0;j<i;j++)
            {
                if(nums[i] > nums[j])
                {
                    lis[i] = Math.max(lis[i], 1 + lis[j]);
                }
            }
            res = Math.max(res,lis[i]);
        }
        
        return res;
            
        
    }
}