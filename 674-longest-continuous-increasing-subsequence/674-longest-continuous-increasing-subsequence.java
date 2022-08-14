class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        int n = nums.length;
        int cnt = 1;
        int gbl = 0;
        for(int i=1;i<n;i++)
        {
            if(nums[i] > nums[i-1])
            {
                cnt++;
            }
            else
            {
                
                gbl = Math.max(cnt,gbl);
                cnt = 1;
            }
            
        }
        
        return gbl>cnt ? gbl : cnt;
        
    }
}