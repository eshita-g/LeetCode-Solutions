class Solution {
public:
    int fourSumCount(vector<int>& nums1, vector<int>& nums2, vector<int>& nums3, vector<int>& nums4) {
        
        unordered_map<int,int> A;
        for(auto u : nums1)
        {
            for(auto v : nums2)
            {
                A[u+v]++;
            }
        }
        int p = 0;
        for(auto a:nums3)
        {
            for(auto b: nums4)
            {
                auto it = A.find(0-a-b);
                if(it != A.end())
                {
                    p = p + it->second;
                }
            }
        }
        return p;
    }
};