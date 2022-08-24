class Solution {
    
    int count = 0;
    public void recurse(int[] nums,int i,int sum,int target)
    {
        if(i == nums.length)
        {
            if(sum == target)
                count++;
            
            return;
        }
        recurse(nums,i+1,sum+nums[i],target);
        recurse(nums,i+1,sum-nums[i],target);    
    }
    public int findTargetSumWays(int[] nums, int target) {
        
        recurse(nums,0,0,target);
        
        return count;
        
    }
}