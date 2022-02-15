class Solution {
public:
    int jump(vector<int>& nums) {
        int n = nums.size();
        if (nums.size()==1) return 0;
        int p = 1;
        int i = 1;
        int max = nums[0];
        while(max < n-1)
        {
            int jmp = 0;
            while(i <= max)
            {
                jmp = std::max(jmp,i+nums[i]);
                i++;
            }
            max = jmp;
            ++p;
        }
        
        return p;
        
    }
};