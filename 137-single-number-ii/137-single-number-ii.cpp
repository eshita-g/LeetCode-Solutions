class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int n = nums.size();
        unordered_map<int,int> A;
        for(int i =0;i<n;i++)
        {
            A[nums[i]]++;
        }
        int p;
        for(auto x : A)
        {
            if(x.second  == 1)
            {
                p = x.first;
                break;
            }
        }
        
        return p;
    }
};