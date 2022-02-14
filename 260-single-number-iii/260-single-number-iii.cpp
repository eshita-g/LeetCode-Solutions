class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        
        int n = nums.size();
        unordered_map<int,int> A;
        for(int i=0;i<n;i++)
        {
            A[nums[i]]++;
        }
        vector<int> B;
        int p = 0;
        for(auto x: A)
        {
            if(x.second == 1)
            {
                B.push_back(x.first);
                p++;
            }
            if(p == 2)
                break;
        }
        
        return B;
        
        
    }
};