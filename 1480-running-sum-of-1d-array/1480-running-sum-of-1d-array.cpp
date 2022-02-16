class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        int n = nums.size();
        vector<int> A(n);
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum = sum + nums[i];
            A[i] = sum;
        }
        return A;
        
    }
};