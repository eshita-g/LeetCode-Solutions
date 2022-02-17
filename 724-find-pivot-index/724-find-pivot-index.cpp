class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int n = nums.size();
        int pref = 0;
        int post = 0;
        for(int i=0;i<n;i++)
        {
            post = post + nums[i];
        }
        for(int i=0;i<n;i++)
        {
            post = post - nums[i];
            if(post == pref)
            {
                return i;
            }
            pref = pref + nums[i];
        }
        return -1;
    }
};