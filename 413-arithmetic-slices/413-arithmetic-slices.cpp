class Solution {
public:
    int numberOfArithmeticSlices(vector<int>& nums) {
        int c= 0;
        int res = 0;
        int n = nums.size();
        if(n<3)
            return 0;
        for(int i=2;i<n;i++)
        {
            if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2])
                c++;
            else
                c=0;
            
            res = res + c;
        }
        return res;
    }
};