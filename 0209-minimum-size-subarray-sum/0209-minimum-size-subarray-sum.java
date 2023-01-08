class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int n = nums.length;
        int i =0;
        int j = 0;
        int sum = 0;
        int global = Integer.MAX_VALUE;
        while(j < n)
        {
            sum = sum + nums[j];
             while(sum >= target)
                {
                    global = Math.min(global,j-i+1);
                    sum = sum - nums[i];
                    i++;
                }
                j++;
                
            
        }
        
        return (global==Integer.MAX_VALUE)?0:global;
    }
}