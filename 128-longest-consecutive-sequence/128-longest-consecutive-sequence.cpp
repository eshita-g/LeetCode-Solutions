class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        int n = nums.size();
        if(n==0)
            return 0;
        sort(nums.begin(),nums.end());
        vector<int> A;
        A.push_back(nums[0]);
        for(int i=1;i<n;i++)
        {
          if(A.back() != nums[i])
          {
              A.push_back(nums[i]);
          }
        }
        int count = 1;
        int max = 1;
        for(int i = 1;i<A.size();i++)
        {
            if(A[i] == A[i-1] + 1)
                count++;
            else
            {
                if(count > max)
                    max = count;
                count = 1;
                
            }
        }
        
        return count>max ? count : max;
    }
};