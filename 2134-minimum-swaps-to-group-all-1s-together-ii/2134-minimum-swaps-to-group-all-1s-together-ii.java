class Solution {
    public int minSwaps(int[] nums) {
        
        int n = nums.length;
        int legal = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] == 1)
                legal++;
        }
        int[] res = new int[2*n];
        for(int i=0;i<n;i++)
        {
            res[i] = nums[i];
            res[n+i] = nums[i];
        }
        int i = 0;
        int  j = 0;
        int count = 0;
        int global = 0;
        while(i < 2*n && j< 2*n)
        {
            if(j-i+1 <= legal)
            {
                if(res[j] == 1 )
                {
                    count++;
                }
                j++;
                
            }
            else
            {
                global = Math.max(count,global);
                if(res[i] == 1)
                {
                    count--;
                }
                i++;
            }
            
        }
        
        return legal-global;
        
    }
}