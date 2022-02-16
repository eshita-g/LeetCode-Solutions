class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int p = 0;
        int n = nums.size();
        for(int i=0;i<n;i++)
        {
            if(nums[i] == 0)
                p++;
        }
        int j = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] != 0)
            {
                nums[j] = nums[i];
                j++;
            }
        }
        int k = n-1;
        while(p!=0)
        {
            nums[k] = 0;
            k--;
            p--;
        }
    }
};