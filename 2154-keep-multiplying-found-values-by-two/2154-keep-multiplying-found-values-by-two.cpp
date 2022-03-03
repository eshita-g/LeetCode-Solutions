class Solution {
public:
    int findFinalValue(vector<int>& nums, int original) {
        int n = nums.size();
        sort(nums.begin(),nums.end());
        int i;
        for(i = 0;i<n;i++)
        {
            if(nums[i] == original)
            {
                original = original * 2;
                
            }
        }
        
        return original;
        
    }
};