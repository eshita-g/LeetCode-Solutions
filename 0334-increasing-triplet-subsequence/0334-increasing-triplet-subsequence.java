class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if(n < 3)
            return false;
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i : nums)
        {
            if(first >= i)
                first = i;
            else if(second >= i)
            {
                second = i;
            }
            else
                return true;
        }
        
        return false;
        
    }
}