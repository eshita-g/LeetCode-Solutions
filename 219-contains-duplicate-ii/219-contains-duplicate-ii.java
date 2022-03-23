class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
             if(i>k)
             {
                 set.remove(nums[i-k-1]);
             }
            if(set.contains(nums[i]))
                return true;
            else
            {
                set.add(nums[i]);
            }
        }
        
        
        return false;
        
    }
}