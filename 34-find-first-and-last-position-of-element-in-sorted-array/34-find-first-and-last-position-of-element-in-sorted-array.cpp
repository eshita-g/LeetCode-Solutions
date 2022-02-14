class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int l = 0;
        int r = nums.size()-1;
        int i = -1;
        int j = -1;
        while(l<=r)
        {
            int mid = (l + r) / 2;
            if(nums[mid] > target)
            {
                r = mid - 1;
            }
            else if(nums[mid] < target)
            {
                l = mid + 1;
            }
            else
            {
                i = mid;
                r = mid - 1;
            }
            
        }
        l = 0;
        r = nums.size()-1;
        while(l<=r)
        {
            int mid = (l + r) / 2;
            if(nums[mid] > target)
            {
                r = mid - 1;
            }
            else if(nums[mid] < target)
            {
                l = mid + 1;
            }
            else
            {
                j = mid;
                l = mid + 1;
            }
            
        }
        vector<int> A;
        A.push_back(i);
        A.push_back(j);
            
       return A; 
    }
};