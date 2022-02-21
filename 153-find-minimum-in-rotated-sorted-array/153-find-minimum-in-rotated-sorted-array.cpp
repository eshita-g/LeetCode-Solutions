class Solution {
public:
    int findMin(vector<int>& nums) {
       int l = 0;
       int r = nums.size()-1;
       int p = 0; 
       while(l < r)
       {
           int mid = l + (r-l)/2;
           if(nums[mid] == nums[r])
           {
               r--;
           }
           else if(nums[mid] > nums[r] )
           {
              l = mid+1;
               
           }
           else
           {
               r = mid;
           }
               
           
       }
        return nums[r];
            
        
    }
};