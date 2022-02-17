class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int j = 0;
        int temp = nums[0];
        int n = nums.size();
        for(int i = 1;i<n;i++)
        {
            if(nums[i] != temp )
            {
                j++;
                nums[j] = nums[i];
                temp = nums[i];
                
            }
        }
        
        return j+1;
        
    }
};