class Solution {
    public int minStartValue(int[] nums) {
        int min = 0;
        int sum = 0;
        for(int i =0;i<nums.length;i++)
        {
            sum += nums[i];
            min =  Math.min(sum,min);
        }
        
        int p = 1 - min;
        return p;
        
    }
}