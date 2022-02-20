class Solution {
public:
    int numPairsDivisibleBy60(vector<int>& time) {
        int n = time.size();
        unordered_map<int,int> A;
        int c = 0;
        for(int i=0;i<n;i++)
        {
            time[i] = time[i] % 60;
        }
        A[0] = 0;
        int count = 0;
        for(auto i:time)
        {
           if(i == 0)
               count = count + A[0];
            else
            {
                if(A.find(60 - i) != A.end())
                    count = count + A[60 - i];
                
                
            }
            A[i]++;
        }
        
        return count;
        
        
        
    }
};