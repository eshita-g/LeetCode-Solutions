class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        unordered_map<int,int> s;
        vector <int> B;
        for(int i=0;i<nums.size();i++)
        {
            if(s.find(target-nums[i])!=s.end())
            {
            
                B.push_back(i);
                B.push_back(s[target-nums[i]]);
                break;
            }
            s[nums[i]] = i;
            
        }
        return B;
        
    }
};