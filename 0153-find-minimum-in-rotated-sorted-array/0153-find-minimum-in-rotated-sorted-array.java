class Solution {
    public int findMin(int[] nums) {
        
        if(nums.length == 1)
            return nums[0];
        int n = nums.length;
        int l = 0;
        int r = nums.length - 1;
        int p = -1;
        while(l <= r)
        {
            int m  = (l+r)/2;
            if(nums[m] <= nums[n-1])
            {
                r = m - 1;
            }
            else 
            {
                if(nums[m] > nums[m+1])
                {
                    p = m;
                    break;
                }
                else
                {
                    l = m + 1;
                }
            }
            
        }
        if( p == -1)
            return nums[0];
        
        return nums[p+1];
    }
}