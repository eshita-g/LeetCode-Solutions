class Solution {
public:
    int missingNumber(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int n = nums.size();
        int res;
        
        for(int i=0;i<n;i++)
        {
          if(nums[i] != i)
          {
              res = i;
              break;
          }
        }
        return res;
        
    }
};