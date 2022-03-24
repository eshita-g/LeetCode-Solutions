class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int n = nums.length;
        int i = 0;
        int j = 0;
        int global = 0;
        int count = 0;
        while(j<n)
        {
            if(nums[j] == 0)
                count++;
            
            if(count < k)
            {   
                global = Math.max(global,j-i+1); 
                j++;
            }    
            else if(count == k)
            {
                global = Math.max(global,j-i+1);
                j++;
            }
            else if(count > k)
            {
                while(count > k)
                {
                    if(nums[i] == 0)
                    {
                        count--;
                        
                    }
                    i++;
                }
                j++;
            }
            
                
        }
        
        return global;
    }
}