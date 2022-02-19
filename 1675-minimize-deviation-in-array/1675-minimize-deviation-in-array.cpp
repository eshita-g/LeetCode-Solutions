class Solution {
public:
    int minimumDeviation(vector<int>& nums) {
        
        set <int> s;
        int n = nums.size();
        for(int i=0;i<n;i++)
        {
            if(nums[i] % 2 != 0)
            {
                s.insert(nums[i]*2);
            }
            else
            {    
              s.insert(nums[i]);
            }    
        }
        int diff = *s.rbegin() - *s.begin();
        while(s.size() && *s.rbegin()%2 == 0)
        {
            int max = *s.rbegin();
            s.erase(max);
            s.insert(max/2);
            diff = std::min(diff, *s.rbegin() - *s.begin());
        }
        
        return diff;
        
    }
};