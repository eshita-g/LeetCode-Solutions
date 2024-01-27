class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int r = nums.length - 1;
        int l = 0;
        int res = nums.length;
        while(l<=r){
            
            int mid = (l+r)/2;
            if(nums[mid]>=target){
                res = mid; 
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        
        return res;
        
    }
}