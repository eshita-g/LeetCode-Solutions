class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        int n = nums.size();
        int small = 0;    
        unordered_set<int> A;
        for(int i=0;i<n;i++)
        {  
            if(A.find(nums[i]) == A.end())
            {    
               A.insert(nums[i]);
            }    
        }
        int p=0;
        small = small+1;
        int out;
        int i=0;
        cout<<small;
        while(p==0 && i<n)
        {
            if(A.find(small) == A.end())
            {
                p=1;
                break;
            }
            i = i+1;
            small = small + 1;
        }
        out = small;
        return out;
        
    }
};