class Solution {
    public int maximizeSum(int[] nums, int k) {
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        int res = 0;
        while(k > 0){
            
            res = res + max;
            max++;
            k--;
            
        }
        return res;
        
    }
}