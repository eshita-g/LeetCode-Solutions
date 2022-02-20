class Solution {
public:
    int removeCoveredIntervals(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end());
        int left = -1;
        int right = -1;
        int out = 0;
        for(auto i : intervals)
        {
            if(i[0] > left && i[1] > right)
            {
                out++;
                left = i[0];
            }
            right = std::max(right,i[1]);
            
        }
        
        return out;
        
        
    }
};