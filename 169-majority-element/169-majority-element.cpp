class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n  = nums.size();
        sort(nums.begin(),nums.end());
        int c = 1;
        int p = nums[0];
        for(int i=1;i<n;i++)
        {
            if(nums[i] == nums[i-1])
            {
                c++;
                p = nums[i];
            }
            else
            {
                if(c > n/2)
                    break;
                c = 1;
                p = nums[i];
            }
        }
        return p;
    }
};