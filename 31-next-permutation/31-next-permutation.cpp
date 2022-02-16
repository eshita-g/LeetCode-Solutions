class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int n = nums.size();
        int p = -1;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i] < nums[i+1])
            {
                p = i;
                break;
            }
        }
        if(p == -1)
            reverse(nums.begin(),nums.end());
        else
        {
            int j;
            for(int i=n-1;i>p;i--)
            {
                if(nums[i] > nums[p])
                {
                    j = i;
                    break;
                }
            }
            swap(nums[p],nums[j]);
            reverse(nums.begin() + p + 1, nums.end());
        }
        
        
    }
};