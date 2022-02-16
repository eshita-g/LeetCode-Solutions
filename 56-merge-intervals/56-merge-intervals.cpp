class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        
        sort(intervals.begin(),intervals.end());
        vector<vector<int>> A;
        for(auto i:intervals)
        {
            if(A.empty() || A.back()[1] < i[0])
            {
                A.push_back(i);
            }
            else
            {
                A.back()[1] = std::max(A.back()[1] , i[1]);
            }
        }
        
        return A;
        
        
    }
};