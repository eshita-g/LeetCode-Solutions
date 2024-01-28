class Solution {
    public int maximumCount(int[] nums) {
        
        int neg = -1;
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        while(l<=r){
            
            int mid = (l+r)/2;
            if(nums[mid] >= 0){
                r = mid - 1;
            }
            else{
                neg = mid;
                l = mid + 1;
            }
        }
        neg = neg + 1;
        l = 0;
        r = n - 1;
        int pos = n;
        while(l<=r){
            int mid = (l+r)/2;
            
            if(nums[mid] > 0){
                pos = mid;
                r = mid - 1;
                
            }
            else{
                l = mid + 1;
            }
        }
        System.out.println(neg);
        pos = n - pos;
        
        
        if(pos > neg)
            return pos;
        
        return neg;
        
    }
}