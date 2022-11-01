class Solution {
    public int search(int[] nums, int target) {
        
        int n = nums.length;
        int l = 0;
        int h = n-1;
        int p = -1;
        while(l<=h)
        {
            int m = (l+h)/2;
            
            if(nums[m] <= nums[n-1])
            {
                h = m - 1;
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
                    l = m+1;
                }
            }
        }
        System.out.println(p);
        int start = p+1;
        l = 0;
        while(l <= p)
        {
            int m = (l+p)/2;
            if(nums[m] == target)
            {
                return m;
            }
            else if(nums[m] > target)
            {
                p = m-1;
            }
            else
            {
                l = m + 1;
            }
            
        }
        l = start;
        h = n-1;
        while(l<=h)
        {
            int m = (l+h)/2;
            if(nums[m] == target)
            {
                return m;
            }
            else if(nums[m] > target)
            {
                h = m-1;
            }
            else
            {
                l = m+1;
            }
        }
        
        
        return -1;
    }
}