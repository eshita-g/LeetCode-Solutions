class Solution {
public:
    int minimumDeletions(vector<int>& nums) {
        int n = nums.size();
        int min = nums[0];
        int max = nums[0];
        int m = 0, p = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] < min)
            {
                min = nums[i];
                m = i;
                
            }
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
                p = i;
            }
        }
        int front =std::max(m,p) + 1;
        int back = n - std::min(m,p);
        int mix = (std::min(m,p) + 1 ) + ( n - std::max(m,p));
        
        return std::min(std::min(front , back),mix);
        
        
        
        
    }
};