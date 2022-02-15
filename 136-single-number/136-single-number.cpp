class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int res = nums[0];
        int n = nums.size();
        for(int i=1;i<n;i++)
        {
            res = res ^ nums[i];
        }
        return res;
    }
};