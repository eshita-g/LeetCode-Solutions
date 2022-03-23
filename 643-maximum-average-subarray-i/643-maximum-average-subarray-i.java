class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double global = 0.0;
        double sum = 0.0;
        for(int i=0;i<k;i++)
        {
            sum = sum + nums[i];
        }
        sum = sum/k;
        global = sum;
        for(int i=k;i<n;i++)
        {
            sum = (((sum*k) + nums[i]) - nums[i-k] )/k;
            global = Math.max(global,sum);
        }
        
        return global;
        
    }
}