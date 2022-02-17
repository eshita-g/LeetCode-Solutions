class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int temp = 1;
        int n = nums.size();
        vector <int> A(n);
        for(int i=0;i<n;i++)
        {
             A[i] = temp;
             temp = temp * nums[i];
        }
        temp = 1;
        for(int i=n-1;i>=0;i--)
        {
            A[i] = A[i] * temp;
            temp = temp * nums[i];
        }
        
        
        return A;
    }
};