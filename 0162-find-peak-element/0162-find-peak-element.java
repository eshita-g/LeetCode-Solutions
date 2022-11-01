class Solution {
    public int findPeakElement(int[] nums) {
        
        int n = nums.length;
        int l = 0;
        int r = n-1;
        if(n == 1)
            return 0;
        while(l <= r)
        {
            int m = (l+r)/2;
            
            if(m == 0 && nums[m] > nums[m+1])
                return m;
            
            else if(m == n-1 && nums[m] > nums[m-1])
                return m;
            
            else if(m!= 0 && m!=n-1 && nums[m] > nums[m+1] && nums[m] > nums[m-1])
                return m;
            
            else
            {
                if(m !=0 && nums[m-1] > nums[m+1])
                    r = m-1;
                
                else
                    l = m + 1;
                  
            }
        }
        
        return -1;
        
    }
}