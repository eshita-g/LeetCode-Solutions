class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        if(n == 1)
            return nums[0];
        if(n==2)
            return Math.max(nums[0],nums[1]);
        int[] f = new int[n];
        int[] s = new int[n];
        f[0] = Math.max(0,nums[0]);
        f[1] = Math.max(f[0],nums[1]);
        for(int i=2;i<n-1;i++)
        {
            f[i] = Math.max(nums[i] + f[i-2], f[i-1]);
            
        }
        s[0] = 0;
        s[1] = Math.max(0,nums[1]);
        s[2] = Math.max(s[1],nums[2]);
        for(int i = 3;i<n;i++)
        {
            s[i] = Math.max(nums[i] + s[i-2], s[i-1]);
        }
        
        return Math.max(f[n-2],s[n-1]);
        
    }
}