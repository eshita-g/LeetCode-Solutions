class Solution {
    public boolean helper(int i,int[] nums,int[] res)
    {
        if(i == nums.length - 1)
            return true;
        
        if(nums[i] == 0)
            return false;
        
        if(res[i] != -1)
        {
            return res[i] == 0 ? false : true;
        }
        int reach = nums[i] + i;
        for(int k=i+1;k<=reach;k++)
        {
            if(k < nums.length && helper(k,nums,res))
            {
                res[i] = 1;
                return true;
            }
        }
        
        res[i] = 0;
        return false;
    }
    public boolean canJump(int[] nums) {
        
        int n = nums.length;
        if(n==1)
            return true;
        
        int[] res = new int[n];
        Arrays.fill(res,-1);
        
        return helper(0,nums,res);
        
    }
}