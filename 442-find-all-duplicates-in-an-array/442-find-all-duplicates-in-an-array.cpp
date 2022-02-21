class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        int n = nums.size();
        unordered_map<int,int> A;
        for(int i=0;i<n;i++)
        {
            A[nums[i]]++;
        }
        vector<int> B;
        for(auto x : A)
        {
            if(x.second == 2)
            {
                B.push_back(x.first);
            }
        }
        
        return B;
        
    }
};