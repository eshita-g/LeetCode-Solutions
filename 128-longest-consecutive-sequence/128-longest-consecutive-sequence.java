class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> A = new HashSet<>();
        for(int i =0;i<nums.length;i++)
        {
            A.add(nums[i]);
            
        }
        int ans = 0;
        for(int i=0;i<nums.length;i++)
        {
        
            if(!A.contains(nums[i] - 1))
            {
                int x = nums[i];
                int len = 0;
                while(A.contains(x))
                {
                    len++;
                    x++;
                }
               ans = Math.max(ans,len);
            }
            
        }
        
        return ans;
    }
}