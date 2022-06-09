class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        
        unordered_map<int,int> s;
        vector <int> B;
        for(int i=0;i<numbers.size();i++)
        {
            if(s.find(target-numbers[i])!=s.end())
            {
                B.push_back(s[target-numbers[i]]);
                B.push_back(i+1);
                break;
            }
            s[numbers[i]] = i+1;
        }
        return B;
    }
};